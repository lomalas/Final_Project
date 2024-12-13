package App.Domain;

public class Class {

    private int classId;                          // Corresponds to CLASS_ID
    private String name;                          // Corresponds to NAME
    private String hitDice;                       // Corresponds to HITDICE
    private String primaryAbilityScores;          // Corresponds to PRIMARY_ABILITY_SCORES
    private String saveProficiencies;             // Corresponds to SAVE_PROFICIENCIES
    private String startingProficiencies;         // Corresponds to STARTING_PROFICIENCIES
    private int levels;                           // Corresponds to LEVELS

    // Constructor to initialize the CharacterClass object
    public Class(int classId, String name, String hitDice, String primaryAbilityScores,
                          String saveProficiencies, String startingProficiencies, int levels) {
        this.classId = classId;
        this.name = name;
        this.hitDice = hitDice;
        this.primaryAbilityScores = primaryAbilityScores;
        this.saveProficiencies = saveProficiencies;
        this.startingProficiencies = startingProficiencies;
        this.levels = levels;
    }

    // Getters and Setters for each attribute

    public int getClassId() {
        return classId;
    }

    public void setClassId(int classId) {
        this.classId = classId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHitDice() {
        return hitDice;
    }

    public void setHitDice(String hitDice) {
        this.hitDice = hitDice;
    }

    public String getPrimaryAbilityScores() {
        return primaryAbilityScores;
    }

    public void setPrimaryAbilityScores(String primaryAbilityScores) {
        this.primaryAbilityScores = primaryAbilityScores;
    }

    public String getSaveProficiencies() {
        return saveProficiencies;
    }

    public void setSaveProficiencies(String saveProficiencies) {
        this.saveProficiencies = saveProficiencies;
    }

    public String getStartingProficiencies() {
        return startingProficiencies;
    }

    public void setStartingProficiencies(String startingProficiencies) {
        this.startingProficiencies = startingProficiencies;
    }

    public int getLevels() {
        return levels;
    }

    public void setLevels(int levels) {
        this.levels = levels;
    }

    // toString() method to represent the CharacterClass object as a string
    @Override
    public String toString() {
        return "CharacterClass{" +
                "classId=" + classId +
                ", name='" + name + '\'' +
                ", hitDice='" + hitDice + '\'' +
                ", primaryAbilityScores='" + primaryAbilityScores + '\'' +
                ", saveProficiencies='" + saveProficiencies + '\'' +
                ", startingProficiencies='" + startingProficiencies + '\'' +
                ", levels=" + levels +
                '}';
    }
}
