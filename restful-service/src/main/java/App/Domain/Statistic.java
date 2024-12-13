package App.Domain;

public class Statistic {

    private String charId;
    private int strength;
    private int dexterity;
    private int constitution;
    private int intelligence;
    private int wisdom;
    private int charisma;

    // Default constructor
    public Statistic() {
        this.strength = 10;
        this.dexterity = 10;
        this.constitution = 10;
        this.intelligence = 10;
        this.wisdom = 10;
        this.charisma = 10;
    }

    // Constructor with parameters
    public Statistic(String charId, int strength, int dexterity, int constitution, int intelligence,
                     int wisdom, int charisma) {
        this.charId = charId;
        setStrength(strength);
        setDexterity(dexterity);
        setConstitution(constitution);
        setIntelligence(intelligence);
        setWisdom(wisdom);
        setCharisma(charisma);
    }

    // Calculate modifier based on ability score (standard D&D formula)
    private int calculateModifier(int score) {
        return (score - 10) / 2;
    }

    // Getters and setters with validation
    public String getCharId() {
        return charId;
    }

    public void setCharId(String charId) {
        this.charId = charId;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        if (strength >= 0 && strength <= 30) {
            this.strength = strength;
        }
    }

    public int getDexterity() {
        return dexterity;
    }

    public void setDexterity(int dexterity) {
        if (dexterity >= 0 && dexterity <= 30) {
            this.dexterity = dexterity;
        }
    }

    public int getConstitution() {
        return constitution;
    }

    public void setConstitution(int constitution) {
        if (constitution >= 0 && constitution <= 30) {
            this.constitution = constitution;
        }
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        if (intelligence >= 0 && intelligence <= 30) {
            this.intelligence = intelligence;
        }
    }

    public int getWisdom() {
        return wisdom;
    }

    public void setWisdom(int wisdom) {
        if (wisdom >= 0 && wisdom <= 30) {
            this.wisdom = wisdom;
        }
    }

    public int getCharisma() {
        return charisma;
    }

    public void setCharisma(int charisma) {
        if (charisma >= 0 && charisma <= 30) {
            this.charisma = charisma;
        }
    }

    // Calculate modifiers dynamically
    public int getStrModifier() {
        return calculateModifier(strength);
    }

    public int getDexModifier() {
        return calculateModifier(dexterity);
    }

    public int getConModifier() {
        return calculateModifier(constitution);
    }

    public int getIntModifier() {
        return calculateModifier(intelligence);
    }

    public int getWisModifier() {
        return calculateModifier(wisdom);
    }

    public int getCharModifier() {
        return calculateModifier(charisma);
    }

    @Override
    public String toString() {
        return String.format("Statistic{charId='%s', Strength=%d (Mod: %d), Dexterity=%d (Mod: %d), Constitution=%d (Mod: %d), " +
                        "Intelligence=%d (Mod: %d), Wisdom=%d (Mod: %d), Charisma=%d (Mod: %d)}",
                charId, strength, getStrModifier(), dexterity, getDexModifier(), constitution, getConModifier(),
                intelligence, getIntModifier(), wisdom, getWisModifier(), charisma, getCharModifier());
    }
}
