package App.Domain;

public class Campaign {

    private int campaignId;
    private String title;
    private String startDate;
    private String endDate;
    private String description;

    // Constructor to initialize the Campaign object
    public Campaign(int campaignId, String title, String startDate, String endDate, String description) {
        this.campaignId = campaignId;
        this.title = title;
        this.startDate = startDate;
        this.endDate = endDate;
        this.description = description;
    }

    // Getter and setter methods for each field

    // Getters
    public int getCampaignId() {
        return campaignId;
    }

    public String getTitle() {
        return title;
    }

    public String getStartDate() {
        return startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public String getDescription() {
        return description;
    }

    // Setters
    public void setCampaignId(int campaignId) {
        this.campaignId = campaignId;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    // Method to display the campaign details (for testing purposes)
    public void displayCampaignDetails() {
        System.out.println("Campaign ID: " + campaignId);
        System.out.println("Title: " + title);
        System.out.println("Start Date: " + startDate);
        System.out.println("End Date: " + endDate);
        System.out.println("Description: " + description);
    }

    // Main method for testing
    public static void main(String[] args) {
        Campaign campaign = new Campaign(1, "Epic Adventure", "2024-01-01", "2024-12-31", "An epic adventure campaign for experienced players.");
        campaign.displayCampaignDetails(); // Display campaign details for testing
    }
}
