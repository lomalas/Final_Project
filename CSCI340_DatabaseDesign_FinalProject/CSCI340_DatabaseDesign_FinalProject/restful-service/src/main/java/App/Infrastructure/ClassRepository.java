package App.Infrastructure;

import App.Domain.Class;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.dao.EmptyResultDataAccessException;

import java.util.List;

public class ClassRepository {

    private JdbcTemplate databaseConnection;

    // Set the database connection
    public void setDatabaseConnection(JdbcTemplate databaseConnection) {
        this.databaseConnection = databaseConnection;
    }

    // Create a new Class entry
    public Class create(Class characterClass) {
        String sql = "INSERT INTO CLASS (CLASS_ID, NAME, HITDICE, PRIMARY_ABILITY_SCORES, SAVE_PROFICIENCIES, STARTING_PROFICIENCIES, LEVELS) " +
                "VALUES (?, ?, ?, ?, ?, ?, ?);";
        this.databaseConnection.update(sql,
                characterClass.getClassId(),
                characterClass.getName(),
                characterClass.getHitDice(),
                characterClass.getPrimaryAbilityScores(),
                characterClass.getSaveProficiencies(),
                characterClass.getStartingProficiencies(),
                characterClass.getLevels());
        return characterClass;
    }

    // Retrieve a Class by its ID
    public Class get(int classId) {
        String sql = "SELECT * FROM CLASS WHERE CLASS_ID = ?;";
        try {
            return this.databaseConnection.queryForObject(sql,
                    BeanPropertyRowMapper.newInstance(Class.class),
                    classId);
        } catch (EmptyResultDataAccessException e) {
            return null; // Handle case where no record is found
        }
    }

    // Retrieve all Classes
    public List<Class> getAll() {
        String sql = "SELECT * FROM CLASS;";
        return this.databaseConnection.query(sql,
                BeanPropertyRowMapper.newInstance(Class.class));
    }

    // Update an existing Class entry
    public int update(int classId, Class characterClass) {
        String sql = "UPDATE CLASS SET NAME = ?, HITDICE = ?, PRIMARY_ABILITY_SCORES = ?, SAVE_PROFICIENCIES = ?, STARTING_PROFICIENCIES = ?, LEVELS = ? " +
                "WHERE CLASS_ID = ?;";
        return this.databaseConnection.update(sql,
                characterClass.getName(),
                characterClass.getHitDice(),
                characterClass.getPrimaryAbilityScores(),
                characterClass.getSaveProficiencies(),
                characterClass.getStartingProficiencies(),
                characterClass.getLevels(),
                classId);
    }

    // Delete a Class entry
    public boolean delete(int classId) {
        String sql = "DELETE FROM CLASS WHERE CLASS_ID = ?;";
        int rowsAffected = this.databaseConnection.update(sql, classId);
        return rowsAffected > 0;
    }
}
