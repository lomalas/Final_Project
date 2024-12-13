package App.Infrastructure;

import App.Domain.Species;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.dao.EmptyResultDataAccessException;

import java.util.List;

public class SpeciesRepository {

    private JdbcTemplate databaseConnection;

    // Set the database connection
    public void setDatabaseConnection(JdbcTemplate databaseConnection) {
        this.databaseConnection = databaseConnection;
    }

    // Create a new Species entry
    public Species create(Species species) {
        String sql = "INSERT INTO SPECIES (SPECIES_NAME, SIZE, SPEED, DESCRIPTION) VALUES (?, ?, ?, ?);";
        this.databaseConnection.update(sql,
                species.getSpeciesName(),
                species.getSize(),
                species.getSpeed(),
                species.getDescription());
        return species;
    }

    // Retrieve a Species by its name
    public Species get(String speciesName) {
        String sql = "SELECT * FROM SPECIES WHERE SPECIES_NAME = ?;";
        try {
            return this.databaseConnection.queryForObject(sql,
                    BeanPropertyRowMapper.newInstance(Species.class),
                    speciesName);
        } catch (EmptyResultDataAccessException e) {
            return null; // Handle case where no record is found
        }
    }

    // Retrieve all Species
    public List<Species> getAll() {
        String sql = "SELECT * FROM SPECIES;";
        return this.databaseConnection.query(sql,
                BeanPropertyRowMapper.newInstance(Species.class));
    }

    // Update an existing Species entry
    public int update(String speciesName, Species species) {
        String sql = "UPDATE SPECIES SET SIZE = ?, SPEED = ?, DESCRIPTION = ? WHERE SPECIES_NAME = ?;";
        return this.databaseConnection.update(sql,
                species.getSize(),
                species.getSpeed(),
                species.getDescription(),
                speciesName);
    }

    // Delete a Species entry
    public boolean delete(String speciesName) {
        String sql = "DELETE FROM SPECIES WHERE SPECIES_NAME = ?;";
        int rowsAffected = this.databaseConnection.update(sql, speciesName);
        return rowsAffected > 0;
    }
}
