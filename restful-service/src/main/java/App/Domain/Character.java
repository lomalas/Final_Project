package App.Domain;

public class Character {

    private String charId;
    private String charName;
    private int charLevel;
    private int exp;
    private int hitPoints;
    private int currentHitPoints;
    private int armorClass;
    private int proficiencyBonus;
    private String alignment;

    // Default constructor
    public Character() {
        this.charName = "Gary Gygax";
        this.charLevel = 1;
        this.exp = 0;
        this.hitPoints = 0;
        this.currentHitPoints = 0;
        this.armorClass = 10;
        this.proficiencyBonus = 2;
    }

    // Constructor with parameters
    public Character(String charId, String charName, int charLevel, int exp, int hitPoints,
                     int currentHitPoints, int armorClass, int proficiencyBonus, String alignment) {
        this.charId = charId;
        this.charName = charName != null ? charName : "Gary Gygax";
        this.charLevel = (charLevel > 0 && charLevel <= 20) ? charLevel : 1;
        this.exp = exp >= 0 ? exp : 0;
        this.hitPoints = hitPoints >= 0 ? hitPoints : 0;
        this.currentHitPoints = currentHitPoints >= 0 ? currentHitPoints : 0;
        this.armorClass = armorClass >= 0 ? armorClass : 10;
        this.proficiencyBonus = (proficiencyBonus >= 2 && proficiencyBonus <= 6) ? proficiencyBonus : 2;
        this.alignment = alignment != null ? alignment : "Neutral";
    }

    // Getters and setters for each field
    public String getCharId() { return charId; }
    public void setCharId(String charId) { this.charId = charId; }

    public String getCharName() { return charName; }
    public void setCharName(String charName) { this.charName = charName; }

    public int getCharLevel() { return charLevel; }
    public void setCharLevel(int charLevel) { if (charLevel > 0 && charLevel <= 20) this.charLevel = charLevel; }

    public int getExp() { return exp; }
    public void setExp(int exp) { if (exp >= 0) this.exp = exp; }

    public int getHitPoints() { return hitPoints; }
    public void setHitPoints(int hitPoints) { if (hitPoints >= 0) this.hitPoints = hitPoints; }

    public int getCurrentHitPoints() { return currentHitPoints; }
    public void setCurrentHitPoints(int currentHitPoints) { if (currentHitPoints >= 0) this.currentHitPoints = currentHitPoints; }

    public int getArmorClass() { return armorClass; }
    public void setArmorClass(int armorClass) { if (armorClass >= 0) this.armorClass = armorClass; }

    public int getProficiencyBonus() { return proficiencyBonus; }
    public void setProficiencyBonus(int proficiencyBonus) { if (proficiencyBonus >= 2 && proficiencyBonus <= 6) this.proficiencyBonus = proficiencyBonus; }

    public String getAlignment() { return alignment; }
    public void setAlignment(String alignment) { this.alignment = alignment; }

    @Override
    public String toString() {
        return "Character{" +
                "charId='" + charId + '\'' +
                ", charName='" + charName + '\'' +
                ", charLevel=" + charLevel +
                ", exp=" + exp +
                ", hitPoints=" + hitPoints +
                ", currentHitPoints=" + currentHitPoints +
                ", armorClass=" + armorClass +
                ", proficiencyBonus=" + proficiencyBonus +
                ", alignment='" + alignment + '\'' +
                '}';
    }

    public static void main(String[] args) {
        // Test default constructor
        Character defaultCharacter = new Character();
        System.out.println(defaultCharacter);

        // Test parameterized constructor
        Character customCharacter = new Character("001", "Aragorn", 10, 10000, 100, 80, 18, 4, "Lawful Good");
        System.out.println(customCharacter);
    }
}
