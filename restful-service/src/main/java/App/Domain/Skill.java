package App.Domain;

public class Skill {

    private String skillName;
    private String relatedAbilityScore;
    private String proficiencyLevel;
    private int modifier;
    private int totalBonus;
    private String charId;  // Foreign key from CHARACTER table

    // Constructor to initialize the Skill object
    public Skill(String skillName, String relatedAbilityScore, String proficiencyLevel, int modifier, int totalBonus, String charId) {
        this.skillName = skillName;
        this.relatedAbilityScore = relatedAbilityScore;
        setProficiencyLevel(proficiencyLevel);
        this.modifier = modifier;
        this.totalBonus = totalBonus;
        this.charId = charId;
    }

    // Getters and Setters for the attributes

    public String getSkillName() {
        return skillName;
    }

    public void setSkillName(String skillName) {
        this.skillName = skillName;
    }

    public String getRelatedAbilityScore() {
        return relatedAbilityScore;
    }

    public void setRelatedAbilityScore(String relatedAbilityScore) {
        this.relatedAbilityScore = relatedAbilityScore;
    }

    public String getProficiencyLevel() {
        return proficiencyLevel;
    }

    public void setProficiencyLevel(String proficiencyLevel) {
        if (proficiencyLevel == null || proficiencyLevel.equals("Proficient") || proficiencyLevel.equals("Expertise")) {
            this.proficiencyLevel = proficiencyLevel;
        } else {
            throw new IllegalArgumentException("Proficiency level must be 'Proficient', 'Expertise', or null.");
        }
    }

    public int getModifier() {
        return modifier;
    }

    public void setModifier(int modifier) {
        this.modifier = modifier;
    }

    public int getTotalBonus() {
        return totalBonus;
    }

    public void setTotalBonus(int totalBonus) {
        this.totalBonus = totalBonus;
    }

    public String getCharId() {
        return charId;
    }

    public void setCharId(String charId) {
        this.charId = charId;
    }

    @Override
    public String toString() {
        return "Skill{" +
                "skillName='" + skillName + '\'' +
                ", relatedAbilityScore='" + relatedAbilityScore + '\'' +
                ", proficiencyLevel='" + proficiencyLevel + '\'' +
                ", modifier=" + modifier +
                ", totalBonus=" + totalBonus +
                ", charId='" + charId + '\'' +
                '}';
    }
}
