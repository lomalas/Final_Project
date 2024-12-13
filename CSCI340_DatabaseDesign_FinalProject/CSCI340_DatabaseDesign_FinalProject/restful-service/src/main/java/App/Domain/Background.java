package App.Domain;

public class Background {

    private String backgroundName;  // Corresponds to BACKGROUND_NAME
    private String toolProficiencies;  // Corresponds to TOOL_PROFICIENCIES
    private String language;  // Corresponds to LANGUAGE
    private String startingEquipment;  // Corresponds to STARTING_EQUIPMENT
    private String description;  // Corresponds to DESCRIPTION
    private String features;  // Corresponds to FEATURES
    private String personalityTraits;  // Corresponds to PERSONALITY_TRAITS
    private String ideals;  // Corresponds to IDEALS
    private String bonds;  // Corresponds to BONDS
    private String flaws;  // Corresponds to FLAWS

    // Constructor to initialize the Background object
    public Background(String backgroundName, String toolProficiencies, String language, String startingEquipment,
                      String description, String features, String personalityTraits, String ideals,
                      String bonds, String flaws) {
        this.backgroundName = backgroundName;
        this.toolProficiencies = toolProficiencies;
        this.language = language;
        this.startingEquipment = startingEquipment;
        this.description = description;
        this.features = features;
        this.personalityTraits = personalityTraits;
        this.ideals = ideals;
        this.bonds = bonds;
        this.flaws = flaws;
    }

    // Getters and Setters for each attribute

    public String getBackgroundName() {
        return backgroundName;
    }

    public void setBackgroundName(String backgroundName) {
        this.backgroundName = backgroundName;
    }

    public String getToolProficiencies() {
        return toolProficiencies;
    }

    public void setToolProficiencies(String toolProficiencies) {
        this.toolProficiencies = toolProficiencies;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getStartingEquipment() {
        return startingEquipment;
    }

    public void setStartingEquipment(String startingEquipment) {
        this.startingEquipment = startingEquipment;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getFeatures() {
        return features;
    }

    public void setFeatures(String features) {
        this.features = features;
    }

    public String getPersonalityTraits() {
        return personalityTraits;
    }

    public void setPersonalityTraits(String personalityTraits) {
        this.personalityTraits = personalityTraits;
    }

    public String getIdeals() {
        return ideals;
    }

    public void setIdeals(String ideals) {
        this.ideals = ideals;
    }

    public String getBonds() {
        return bonds;
    }

    public void setBonds(String bonds) {
        this.bonds = bonds;
    }

    public String getFlaws() {
        return flaws;
    }

    public void setFlaws(String flaws) {
        this.flaws = flaws;
    }

    // toString() method to represent the Background object as a string
    @Override
    public String toString() {
        return "Background{" +
                "backgroundName='" + backgroundName + '\'' +
                ", toolProficiencies='" + toolProficiencies + '\'' +
                ", language='" + language + '\'' +
                ", startingEquipment='" + startingEquipment + '\'' +
                ", description='" + description + '\'' +
                ", features='" + features + '\'' +
                ", personalityTraits='" + personalityTraits + '\'' +
                ", ideals='" + ideals + '\'' +
                ", bonds='" + bonds + '\'' +
                ", flaws='" + flaws + '\'' +
                '}';
    }
}
