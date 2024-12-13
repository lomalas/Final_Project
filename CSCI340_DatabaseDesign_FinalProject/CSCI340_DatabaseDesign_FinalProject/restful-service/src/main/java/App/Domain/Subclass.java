package App.Domain;

public class Subclass {

    private int subclassId;                          // Corresponds to SUBCLASS_ID
    private int classId;                             // Corresponds to CLASS_ID (foreign key to the CLASS table)
    private String subclassName;                     // Corresponds to SUBCLASS_NAME
    private String description;                      // Corresponds to DESCRIPTION
    private String levelRequirements;                // Corresponds to LEVEL_REQUIREMENTS
    private String subclassFeatures;                 // Corresponds to SUBCLASS_FEATURES

    // Constructor to initialize the Subclass object
    public Subclass(int subclassId, int classId, String subclassName, String description,
                    String levelRequirements, String subclassFeatures) {
        this.subclassId = subclassId;
        this.classId = classId;
        this.subclassName = subclassName;
        this.description = description;
        this.levelRequirements = levelRequirements;
        this.subclassFeatures = subclassFeatures;
    }

    // Getters and Setters for each attribute

    public int getSubclassId() {
        return subclassId;
    }

    public void setSubclassId(int subclassId) {
        this.subclassId = subclassId;
    }

    public int getClassId() {
        return classId;
    }

    public void setClassId(int classId) {
        this.classId = classId;
    }

    public String getSubclassName() {
        return subclassName;
    }

    public void setSubclassName(String subclassName) {
        this.subclassName = subclassName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLevelRequirements() {
        return levelRequirements;
    }

    public void setLevelRequirements(String levelRequirements) {
        this.levelRequirements = levelRequirements;
    }

    public String getSubclassFeatures() {
        return subclassFeatures;
    }

    public void setSubclassFeatures(String subclassFeatures) {
        this.subclassFeatures = subclassFeatures;
    }

    // toString() method to represent the Subclass object as a string
    @Override
    public String toString() {
        return "Subclass{" +
                "subclassId=" + subclassId +
                ", classId=" + classId +
                ", subclassName='" + subclassName + '\'' +
                ", description='" + description + '\'' +
                ", levelRequirements='" + levelRequirements + '\'' +
                ", subclassFeatures='" + subclassFeatures + '\'' +
                '}';
    }
}
