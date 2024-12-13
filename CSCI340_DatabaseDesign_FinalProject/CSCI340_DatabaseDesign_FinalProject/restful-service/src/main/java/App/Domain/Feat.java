package App.Domain;

public class Feat {

    private int featId;  // Corresponds to FEAT_ID
    private String featName;  // Corresponds to FEAT_NAME
    private String prerequisite;  // Corresponds to PREREQUISITE
    private String feature;  // Corresponds to FEATURE

    // Constructor to initialize the Feat object
    public Feat(int featId, String featName, String prerequisite, String feature) {
        this.featId = featId;
        this.featName = featName;
        this.prerequisite = prerequisite;
        this.feature = feature;
    }

    // Getters and Setters for each attribute

    public int getFeatId() {
        return featId;
    }

    public void setFeatId(int featId) {
        this.featId = featId;
    }

    public String getFeatName() {
        return featName;
    }

    public void setFeatName(String featName) {
        this.featName = featName;
    }

    public String getPrerequisite() {
        return prerequisite;
    }

    public void setPrerequisite(String prerequisite) {
        this.prerequisite = prerequisite;
    }

    public String getFeature() {
        return feature;
    }

    public void setFeature(String feature) {
        this.feature = feature;
    }

    // toString() method to represent the Feat object as a string
    @Override
    public String toString() {
        return "Feat{" +
                "featId=" + featId +
                ", featName='" + featName + '\'' +
                ", prerequisite='" + prerequisite + '\'' +
                ", feature='" + feature + '\'' +
                '}';
    }
}
