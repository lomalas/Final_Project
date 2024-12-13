package App.Domain;

import java.util.Arrays;
import java.util.List;

public class Background {

    private String backgroundName;  // Corresponds to BACKGROUND_NAME
    private List<String> toolProficiencies;  // Corresponds to TOOL_PROFICIENCIES
    private List<String> languages;  // Corresponds to LANGUAGE
    private List<String> startingEquipment;  // Corresponds to STARTING_EQUIPMENT
    private String description;  // Corresponds to DESCRIPTION
    private String features;  // Corresponds to FEATURES
    private String personalityTraits;  // Corresponds to PERSONALITY_TRAITS
    private String ideals;  // Corresponds to IDEALS
    private String bonds;  // Corresponds to BONDS
    private String flaws;  // Corresponds to FLAWS

    // Default constructor
    public Background() {
    }

    // Constructor to initialize the Background object
    public Background(String backgroundName, List<String> toolProficiencies, List<String> languages,
                      List<String> startingEquipment, String description, String features,
                      String personalityTraits, String ideals, String bonds, String flaws) {
        this.backgroundName = backgroundName;
        this.toolProficiencies = toolProficiencies;
        this.languages = languages;
        this.startingEquipment = startingEquipment;
        this.description = description;
        this.features = features;
        this.personalityTraits = personalityTraits;
        this.ideals = ideals;
        this.bonds = bonds;
        this.flaws = flaws;
    }

    // Getters and setters

    public String getBackgroundName() {
        return backgroundName;
    }

    public void setBackgroundName(String backgroundName) {
        this.backgroundName = backgroundName;
    }

    public List<String> getToolProficiencies() {
        return toolProficiencies;
    }

    public void setToolProficiencies(List<String> toolProficiencies) {
        this.toolProficiencies = toolProficiencies;
    }

    public List<String> getLanguages() {
        return languages;
    }

    public void setLanguages(List<String> languages) {
        this.languages = languages;
    }

    public List<String> getStartingEquipment() {
        return startingEquipment;
    }

    public void setStartingEquipment(List<String> startingEquipment) {
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
                ", toolProficiencies=" + toolProficiencies +
                ", languages=" + languages +
                ", startingEquipment=" + startingEquipment +
                ", description='" + description + '\'' +
                ", features='" + features + '\'' +
                ", personalityTraits='" + personalityTraits + '\'' +
                ", ideals='" + ideals + '\'' +
                ", bonds='" + bonds + '\'' +
                ", flaws='" + flaws + '\'' +
                '}';
    }

    // Main method to test the Background class
    public static void main(String[] args) {
        // Creating a sample Background object
        Background background = new Background(
                "Soldier",
                Arrays.asList("Smith's tools", "Vehicles (land)"),
                Arrays.asList("Common", "Elvish"),
                Arrays.asList("A longsword", "A shield", "Explorer's pack"),
                "A soldier from a distant army",
                "Combat training",
                "Loyal and disciplined",
                "Serve the kingdom",
                "Duty before personal desires",
                "A deep scar from the battlefield"
        );

        // Print the object
        System.out.println(background);
    }
}
