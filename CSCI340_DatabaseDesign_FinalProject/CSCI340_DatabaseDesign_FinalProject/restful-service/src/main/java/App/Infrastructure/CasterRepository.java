package App.Infrastructure;

import App.Domain.Caster;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.dao.EmptyResultDataAccessException;

import java.util.List;

public class CasterRepository {

    private JdbcTemplate databaseConnection;

    // Set the database connection
    public void setDatabaseConnection(JdbcTemplate databaseConnection) {
        this.databaseConnection = databaseConnection;
    }

    // Create a new Caster entry
    public Caster create(Caster caster) {
        String sql = "INSERT INTO CASTER (CASTER_ID, CLASS_ID, TYPE, SPELL_SLOTS, SPELLS_KNOWN, PREPARED_SPELLS, SPELL_ATTACK) " +
                "VALUES (?, ?, ?, ?, ?, ?, ?);";
        this.databaseConnection.update(sql,
                caster.getCasterId(),
                caster.getClassId(),
                caster.getType(),
                caster.getSpellSlots(),
                caster.getSpellsKnown(),
                caster.getPreparedSpells(),
                caster.getSpellAttack());
        return caster;
    }

    // Retrieve a Caster by its ID
    public Caster get(int casterId) {
        String sql = "SELECT * FROM CASTER WHERE CASTER_ID = ?;";
        try {
            return this.databaseConnection.queryForObject(sql,
                    BeanPropertyRowMapper.newInstance(Caster.class),
                    casterId);
        } catch (EmptyResultDataAccessException e) {
            // Handle the case where no results are found
            return null;
        }
    }

    // Retrieve all Casters
    public List<Caster> getAll() {
        String sql = "SELECT * FROM CASTER;";
        return this.databaseConnection.query(sql,
                BeanPropertyRowMapper.newInstance(Caster.class));
    }

    // Update an existing Caster entry
    public int update(int casterId, Caster caster) {
        String sql = "UPDATE CASTER SET CLASS_ID = ?, TYPE = ?, SPELL_SLOTS = ?, SPELLS_KNOWN = ?, PREPARED_SPELLS = ?, SPELL_ATTACK = ? " +
                "WHERE CASTER_ID = ?;";
        return this.databaseConnection.update(sql,
                caster.getClassId(),
                caster.getType(),
                caster.getSpellSlots(),
                caster.getSpellsKnown(),
                caster.getPreparedSpells(),
                caster.getSpellAttack(),
                casterId);
    }

    // Delete a Caster entry
    public boolean delete(int casterId) {
        String sql = "DELETE FROM CASTER WHERE CASTER_ID = ?;";
        int rowsAffected = this.databaseConnection.update(sql, casterId);
        return rowsAffected > 0;
    }
}
