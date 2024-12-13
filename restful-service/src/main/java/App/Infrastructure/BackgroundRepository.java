package App.Infrastructure;

import App.Domain.Background;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.dao.EmptyResultDataAccessException;

import java.util.List;

public class BackgroundRepository {

    private JdbcTemplate databaseConnection;

    // Set the database connection
    public void setDatabaseConnection(JdbcTemplate databaseConnection) {
        this.databaseConnection = databaseConnection;
    }

    // Create a new Background entry
    public Background create(Background background) {
        String sql = "INSERT INTO BACKGROUND (BACKGROUND_NAME, TOOL_PROFICIENCIES, LANGUAGE, STARTING_EQUIPMENT, " +
                "DESCRIPTION, FEATURES, PERSONALITY_TRAITS, IDEALS, BONDS, FLAWS) " +
                "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?);";
        this.databaseConnection.update(sql,
                background.getBackgroundName(),
                background.getToolProficiencies(),
                background.getLanguage(),
                background.getStartingEquipment(),
                background.getDescription(),
                background.getFeatures(),
                background.getPersonalityTraits(),
                background.getIdeals(),
                background.getBonds(),
                background.getFlaws());
        return background;
    }

    // Retrieve a Background by its name
    public Background get(String backgroundName) {
        String sql = "SELECT * FROM BACKGROUND WHERE BACKGROUND_NAME = ?;";
        try {
            return this.databaseConnection.queryForObject(sql,
                    BeanPropertyRowMapper.newInstance(Background.class),
                    backgroundName);
        } catch (EmptyResultDataAccessException e) {
            // Handle the case where no results are found
            return null;
        }
    }

    // Retrieve all Backgrounds
    public List<Background> getAll() {
        String sql = "SELECT * FROM BACKGROUND;";
        return this.databaseConnection.query(sql,
                BeanPropertyRowMapper.newInstance(Background.class));
    }

    // Update an existing Background entry
    public int update(String backgroundName, Background background) {
        String sql = "UPDATE BACKGROUND SET TOOL_PROFICIENCIES = ?, LANGUAGE = ?, STARTING_EQUIPMENT = ?, " +
                "DESCRIPTION = ?, FEATURES = ?, PERSONALITY_TRAITS = ?, IDEALS = ?, BONDS = ?, FLAWS = ? " +
                "WHERE BACKGROUND_NAME = ?;";
        return this.databaseConnection.update(sql,
                background.getToolProficiencies(),
                background.getLanguage(),
                background.getStartingEquipment(),
                background.getDescription(),
                background.getFeatures(),
                background.getPersonalityTraits(),
                background.getIdeals(),
                background.getBonds(),
                background.getFlaws(),
                backgroundName);
    }

    // Delete a Background entry
    public boolean delete(String backgroundName) {
        String sql = "DELETE FROM BACKGROUND WHERE BACKGROUND_NAME = ?;";
        int rowsAffected = this.databaseConnection.update(sql, backgroundName);
        return rowsAffected > 0;
    }
}
