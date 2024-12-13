package App.Domain;

public class Caster {

    private int casterId;                           // Corresponds to CASTER_ID
    private int classId;                            // Corresponds to CLASS_ID (foreign key to the CLASS table)
    private String type;                            // Corresponds to TYPE (e.g., Full, Half, Third, None)
    private String spellSlots;                      // Corresponds to SPELL_SLOTS (e.g., "4/3/2/1")
    private int spellsKnown;                        // Corresponds to SPELLS_KNOWN
    private int preparedSpells;                     // Corresponds to PREPARED_SPELLS
    private String spellAttack;                     // Corresponds to SPELL_ATTACK (e.g., "INT + Proficiency")

    // Constructor to initialize the Caster object
    public Caster(int casterId, int classId, String type, String spellSlots,
                  int spellsKnown, int preparedSpells, String spellAttack) {
        this.casterId = casterId;
        this.classId = classId;
        this.type = type;
        this.spellSlots = spellSlots;
        this.spellsKnown = spellsKnown;
        this.preparedSpells = preparedSpells;
        this.spellAttack = spellAttack;
    }

    // Getters and Setters for each attribute

    public int getCasterId() {
        return casterId;
    }

    public void setCasterId(int casterId) {
        this.casterId = casterId;
    }

    public int getClassId() {
        return classId;
    }

    public void setClassId(int classId) {
        this.classId = classId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSpellSlots() {
        return spellSlots;
    }

    public void setSpellSlots(String spellSlots) {
        this.spellSlots = spellSlots;
    }

    public int getSpellsKnown() {
        return spellsKnown;
    }

    public void setSpellsKnown(int spellsKnown) {
        this.spellsKnown = spellsKnown;
    }

    public int getPreparedSpells() {
        return preparedSpells;
    }

    public void setPreparedSpells(int preparedSpells) {
        this.preparedSpells = preparedSpells;
    }

    public String getSpellAttack() {
        return spellAttack;
    }

    public void setSpellAttack(String spellAttack) {
        this.spellAttack = spellAttack;
    }

    // toString() method to represent the Caster object as a string
    @Override
    public String toString() {
        return "Caster{" +
                "casterId=" + casterId +
                ", classId=" + classId +
                ", type='" + type + '\'' +
                ", spellSlots='" + spellSlots + '\'' +
                ", spellsKnown=" + spellsKnown +
                ", preparedSpells=" + preparedSpells +
                ", spellAttack='" + spellAttack + '\'' +
                '}';
    }
}
