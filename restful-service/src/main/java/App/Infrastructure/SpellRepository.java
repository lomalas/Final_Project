package App.Infrastructure;

import App.Domain.Spell;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.dao.EmptyResultDataAccessException;

import java.util.List;

public class SpellRepository {

    private JdbcTemplate databaseConnection;

    // Set the database connection
    public void setDatabaseConnection(JdbcTemplate databaseConnection) {
        this.databaseConnection = databaseConnection;
    }

    // Create a new Spell entry
    public Spell create(Spell spell) {
        String sql = "INSERT INTO SPELL (SPELL_ID, SPELL_NAME, SPELL_LEVEL, SCHOOL, CASTING_TIME, RANGE, COMPONENTS, DURATION, DAMAGE, EFFECT, LEVEL_REQUIREMENTS) " +
                "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);";
        this.databaseConnection.update(sql,
                spell.getSpellId(),
                spell.getSpellName(),
                spell.getSpellLevel(),
                spell.getSchool(),
                spell.getCastingTime(),
                spell.getRange(),
                spell.getComponents(),
                spell.getDuration(),
                spell.getDamage(),
                spell.getEffect(),
                spell.getLevelRequirements());
        return spell;
    }

    // Retrieve a Spell by its ID
    public Spell get(int spellId) {
        String sql = "SELECT * FROM SPELL WHERE SPELL_ID = ?;";
        try {
            return this.databaseConnection.queryForObject(sql,
                    BeanPropertyRowMapper.newInstance(Spell.class),
                    spellId);
        } catch (EmptyResultDataAccessException e) {
            return null; // Handle case where no record is found
        }
    }

    // Retrieve all Spells
    public List<Spell> getAll() {
        String sql = "SELECT * FROM SPELL;";
        return this.databaseConnection.query(sql,
                BeanPropertyRowMapper.newInstance(Spell.class));
    }

    // Update an existing Spell entry
    public int update(int spellId, Spell spell) {
        String sql = "UPDATE SPELL SET SPELL_NAME = ?, SPELL_LEVEL = ?, SCHOOL = ?, CASTING_TIME = ?, RANGE = ?, COMPONENTS = ?, DURATION = ?, DAMAGE = ?, EFFECT = ?, LEVEL_REQUIREMENTS = ? WHERE SPELL_ID = ?;";
        return this.databaseConnection.update(sql,
                spell.getSpellName(),
                spell.getSpellLevel(),
                spell.getSchool(),
                spell.getCastingTime(),
                spell.getRange(),
                spell.getComponents(),
                spell.getDuration(),
                spell.getDamage(),
                spell.getEffect(),
                spell.getLevelRequirements(),
                spellId);
    }

    // Delete a Spell entry
    public boolean delete(int spellId) {
        String sql = "DELETE FROM SPELL WHERE SPELL_ID = ?;";
        int rowsAffected = this.databaseConnection.update(sql, spellId);
        return rowsAffected > 0;
    }
}
