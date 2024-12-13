package App.Domain;

public class Spell {

    private int spellId;               // Corresponds to SPELL_ID (Primary Key)
    private String spellName;          // Corresponds to SPELL_NAME
    private int spellLevel;            // Corresponds to SPELL_LEVEL
    private String school;             // Corresponds to SCHOOL
    private String castingTime;        // Corresponds to CASTING_TIME
    private String range;              // Corresponds to RANGE
    private String components;         // Corresponds to COMPONENTS
    private String duration;           // Corresponds to DURATION
    private String damage;             // Corresponds to DAMAGE (if applicable)
    private String effect;             // Corresponds to EFFECT
    private String levelRequirements;  // Corresponds to LEVEL_REQUIREMENTS

    // Constructor to initialize the Spell object
    public Spell(int spellId, String spellName, int spellLevel, String school, String castingTime,
                 String range, String components, String duration, String damage,
                 String effect, String levelRequirements) {
        this.spellId = spellId;
        this.spellName = spellName;
        this.spellLevel = spellLevel;
        this.school = school;
        this.castingTime = castingTime;
        this.range = range;
        this.components = components;
        this.duration = duration;
        this.damage = damage;
        this.effect = effect;
        this.levelRequirements = levelRequirements;
    }

    // Getters and Setters for each attribute

    public int getSpellId() {
        return spellId;
    }

    public void setSpellId(int spellId) {
        this.spellId = spellId;
    }

    public String getSpellName() {
        return spellName;
    }

    public void setSpellName(String spellName) {
        this.spellName = spellName;
    }

    public int getSpellLevel() {
        return spellLevel;
    }

    public void setSpellLevel(int spellLevel) {
        this.spellLevel = spellLevel;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getCastingTime() {
        return castingTime;
    }

    public void setCastingTime(String castingTime) {
        this.castingTime = castingTime;
    }

    public String getRange() {
        return range;
    }

    public void setRange(String range) {
        this.range = range;
    }

    public String getComponents() {
        return components;
    }

    public void setComponents(String components) {
        this.components = components;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getDamage() {
        return damage;
    }

    public void setDamage(String damage) {
        this.damage = damage;
    }

    public String getEffect() {
        return effect;
    }

    public void setEffect(String effect) {
        this.effect = effect;
    }

    public String getLevelRequirements() {
        return levelRequirements;
    }

    public void setLevelRequirements(String levelRequirements) {
        this.levelRequirements = levelRequirements;
    }

    // toString() method to represent the Spell object as a string
    @Override
    public String toString() {
        return "Spell{" +
                "spellId=" + spellId +
                ", spellName='" + spellName + '\'' +
                ", spellLevel=" + spellLevel +
                ", school='" + school + '\'' +
                ", castingTime='" + castingTime + '\'' +
                ", range='" + range + '\'' +
                ", components='" + components + '\'' +
                ", duration='" + duration + '\'' +
                ", damage='" + damage + '\'' +
                ", effect='" + effect + '\'' +
                ", levelRequirements='" + levelRequirements + '\'' +
                '}';
    }
}
