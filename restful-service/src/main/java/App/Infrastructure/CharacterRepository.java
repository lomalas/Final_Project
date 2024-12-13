package App.Infrastructure;

import App.Domain.Character;
import App.Domain.ICharacterRepository;
import App.Domain.Skill;
import App.Domain.Statistic;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class CharacterRepository implements ICharacterRepository {
    private JdbcTemplate databaseConnection;

    @Override
    public Character create(Character character) {
        String sql = "INSERT INTO CHARACTER (CHAR_ID, CHAR_NAME, CHAR_LEVEL, EXP, HITPOINTS, CURRENT_HITPOINTS, " +
                "ARMOR_CLASS, PROFICIENCYBONUS, ALIGNMENT) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?);";
        this.databaseConnection.update(sql,
                character.getCharId(),
                character.getCharName(),
                character.getCharLevel(),
                character.getExp(),
                character.getHitPoints(),
                character.getCurrentHitPoints(),
                character.getArmorClass(),
                character.getProficiencyBonus(),
                character.getAlignment());
        return character;
    }

    @Override
    public int update(String id, Character character) {
        String sql = "UPDATE CHARACTER SET CHAR_NAME = ?, CHAR_LEVEL = ?, EXP = ?, HITPOINTS = ?, CURRENT_HITPOINTS = ?, " +
                "ARMOR_CLASS = ?, PROFICIENCYBONUS = ?, ALIGNMENT = ? WHERE CHAR_ID = ?;";
        return this.databaseConnection.update(sql,
                character.getCharName(),
                character.getCharLevel(),
                character.getExp(),
                character.getHitPoints(),
                character.getCurrentHitPoints(),
                character.getArmorClass(),
                character.getProficiencyBonus(),
                character.getAlignment(),
                id);
    }

    @Override
    public boolean delete(String id) {
        String sql = "DELETE FROM CHARACTER WHERE CHAR_ID = ?;";
        int rows = this.databaseConnection.update(sql, id);
        return rows > 0;
    }

    @Override
    public List<Character> get(String id) {
        String sql = "SELECT * FROM CHARACTER WHERE CHAR_ID = ?;";
        List<Character> characters = null;
        try {
            characters = this.databaseConnection.query(sql,
                    BeanPropertyRowMapper.newInstance(Character.class),
                    id);
        } catch (EmptyResultDataAccessException e) {
            characters = null;
        }
        return characters;
    }

    @Override
    public List<Character> get() {
        String sql = "SELECT * FROM CHARACTER;";
        return this.databaseConnection.query(sql, BeanPropertyRowMapper.newInstance(Character.class));
    }

    @Override
    public void setDatabaseConnection(JdbcTemplate databaseConnection) {
        this.databaseConnection = databaseConnection;
    }

    // Fetch the hitpoints of a specific character by ID
    public int getHitpoints(String id) {
        String sql = "SELECT HITPOINTS FROM CHARACTER WHERE CHAR_ID = ?;";
        return this.databaseConnection.queryForObject(sql, Integer.class, id);
    }

    // Fetch character statistics (e.g., Strength, Dexterity)
    public List<Statistic> getStatistics(String charId) {
        String sql = "SELECT * FROM STATISTIC WHERE CHAR_ID = ?;";
        return this.databaseConnection.query(sql, BeanPropertyRowMapper.newInstance(Statistic.class), charId);
    }

    // Fetch character skills
    public List<Skill> getSkills(String charId) {
        String sql = "SELECT * FROM SKILL WHERE CHAR_ID = ?;";
        return this.databaseConnection.query(sql, BeanPropertyRowMapper.newInstance(Skill.class), charId);
    }
}
