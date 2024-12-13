package App.Infrastructure;

import App.Domain.Campaign;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.dao.EmptyResultDataAccessException;

import java.util.List;

public class CampaignRepository {

    private JdbcTemplate databaseConnection;

    // Set the database connection
    public void setDatabaseConnection(JdbcTemplate databaseConnection) {
        this.databaseConnection = databaseConnection;
    }

    // Create a new Campaign entry
    public Campaign create(Campaign campaign) {
        String sql = "INSERT INTO CAMPAIGN (CAMPAIGN_ID, TITLE, START_DATE, END_DATE, DESCRIPTION) " +
                "VALUES (?, ?, ?, ?, ?);";
        this.databaseConnection.update(sql,
                campaign.getCampaignId(),
                campaign.getTitle(),
                campaign.getStartDate(),
                campaign.getEndDate(),
                campaign.getDescription());
        return campaign;
    }

    // Retrieve a Campaign by its ID
    public Campaign get(int campaignId) {
        String sql = "SELECT * FROM CAMPAIGN WHERE CAMPAIGN_ID = ?;";
        try {
            return this.databaseConnection.queryForObject(sql,
                    BeanPropertyRowMapper.newInstance(Campaign.class),
                    campaignId);
        } catch (EmptyResultDataAccessException e) {
            // Handle the case where no results are found
            return null;
        }
    }

    // Retrieve all Campaigns
    public List<Campaign> getAll() {
        String sql = "SELECT * FROM CAMPAIGN;";
        return this.databaseConnection.query(sql,
                BeanPropertyRowMapper.newInstance(Campaign.class));
    }

    // Update an existing Campaign entry
    public int update(int campaignId, Campaign campaign) {
        String sql = "UPDATE CAMPAIGN SET TITLE = ?, START_DATE = ?, END_DATE = ?, DESCRIPTION = ? " +
                "WHERE CAMPAIGN_ID = ?;";
        return this.databaseConnection.update(sql,
                campaign.getTitle(),
                campaign.getStartDate(),
                campaign.getEndDate(),
                campaign.getDescription(),
                campaignId);
    }

    // Delete a Campaign entry
    public boolean delete(int campaignId) {
        String sql = "DELETE FROM CAMPAIGN WHERE CAMPAIGN_ID = ?;";
        int rowsAffected = this.databaseConnection.update(sql, campaignId);
        return rowsAffected > 0;
    }
}
