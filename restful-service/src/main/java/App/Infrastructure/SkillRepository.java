package App.Infrastructure;

import App.Domain.Skill;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.dao.EmptyResultDataAccessException;

import java.util.List;

public class SkillRepository {

    private JdbcTemplate databaseConnection;

    // Set the database connection
    public void setDatabaseConnection(JdbcTemplate databaseConnection) {
        this.databaseConnection = databaseConnection;
    }

    // Create a new Skill entry
    public Skill create(Skill skill) {
        String sql = "INSERT INTO SKILL (SKILL_NAME, RELATED_ABILITY_SCORE, PROFICIENCY_LEVEL, MODIFIER, TOTAL_BONUS, CHAR_ID) " +
                "VALUES (?, ?, ?, ?, ?, ?);";
        this.databaseConnection.update(sql,
                skill.getSkillName(),
                skill.getRelatedAbilityScore(),
                skill.getProficiencyLevel(),
                skill.getModifier(),
                skill.getTotalBonus(),
                skill.getCharId());
        return skill;
    }

    // Retrieve a Skill by its name and character ID
    public Skill get(String skillName, String charId) {
        String sql = "SELECT * FROM SKILL WHERE SKILL_NAME = ? AND CHAR_ID = ?;";
        try {
            return this.databaseConnection.queryForObject(sql,
                    BeanPropertyRowMapper.newInstance(Skill.class),
                    skillName, charId);
        } catch (EmptyResultDataAccessException e) {
            return null; // Handle case where no record is found
        }
    }

    // Retrieve all Skills for a specific character
    public List<Skill> getByCharacter(String charId) {
        String sql = "SELECT * FROM SKILL WHERE CHAR_ID = ?;";
        return this.databaseConnection.query(sql,
                BeanPropertyRowMapper.newInstance(Skill.class),
                charId);
    }

    // Retrieve all Skills with a specific proficiency level
    public List<Skill> getByProficiencyLevel(String proficiencyLevel) {
        String sql = "SELECT * FROM SKILL WHERE PROFICIENCY_LEVEL = ?;";
        return this.databaseConnection.query(sql,
                BeanPropertyRowMapper.newInstance(Skill.class),
                proficiencyLevel);
    }

    // Update an existing Skill entry
    public int update(String skillName, String charId, Skill skill) {
        String sql = "UPDATE SKILL SET RELATED_ABILITY_SCORE = ?, PROFICIENCY_LEVEL = ?, MODIFIER = ?, TOTAL_BONUS = ? " +
                "WHERE SKILL_NAME = ? AND CHAR_ID = ?;";
        return this.databaseConnection.update(sql,
                skill.getRelatedAbilityScore(),
                skill.getProficiencyLevel(),
                skill.getModifier(),
                skill.getTotalBonus(),
                skillName, charId);
    }

    // Delete a Skill entry
    public boolean delete(String skillName, String charId) {
        String sql = "DELETE FROM SKILL WHERE SKILL_NAME = ? AND CHAR_ID = ?;";
        int rowsAffected = this.databaseConnection.update(sql, skillName, charId);
        return rowsAffected > 0;
    }
}
