package App.Infrastructure;

import App.Domain.Feat;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.dao.EmptyResultDataAccessException;

import java.util.List;

public class FeatRepository {

    private JdbcTemplate databaseConnection;

    // Set the database connection
    public void setDatabaseConnection(JdbcTemplate databaseConnection) {
        this.databaseConnection = databaseConnection;
    }

    // Create a new Feat entry
    public Feat create(Feat feat) {
        String sql = "INSERT INTO FEAT (FEAT_ID, FEAT_NAME, PREREQUISITE, FEATURE) VALUES (?, ?, ?, ?);";
        this.databaseConnection.update(sql,
                feat.getFeatId(),
                feat.getFeatName(),
                feat.getPrerequisite(),
                feat.getFeature());
        return feat;
    }

    // Retrieve a Feat by its ID
    public Feat get(int featId) {
        String sql = "SELECT * FROM FEAT WHERE FEAT_ID = ?;";
        try {
            return this.databaseConnection.queryForObject(sql,
                    BeanPropertyRowMapper.newInstance(Feat.class),
                    featId);
        } catch (EmptyResultDataAccessException e) {
            return null; // Handle case where no record is found
        }
    }

    // Retrieve all Feats
    public List<Feat> getAll() {
        String sql = "SELECT * FROM FEAT;";
        return this.databaseConnection.query(sql,
                BeanPropertyRowMapper.newInstance(Feat.class));
    }

    // Update an existing Feat entry
    public int update(int featId, Feat feat) {
        String sql = "UPDATE FEAT SET FEAT_NAME = ?, PREREQUISITE = ?, FEATURE = ? WHERE FEAT_ID = ?;";
        return this.databaseConnection.update(sql,
                feat.getFeatName(),
                feat.getPrerequisite(),
                feat.getFeature(),
                featId);
    }

    // Delete a Feat entry
    public boolean delete(int featId) {
        String sql = "DELETE FROM FEAT WHERE FEAT_ID = ?;";
        int rowsAffected = this.databaseConnection.update(sql, featId);
        return rowsAffected > 0;
    }
}
