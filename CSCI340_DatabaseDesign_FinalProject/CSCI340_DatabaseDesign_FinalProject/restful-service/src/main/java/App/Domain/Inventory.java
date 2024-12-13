package App.Domain;

public class Inventory {

    private int inventoryId;  // Corresponds to INVENTORY_ID
    private String charId;    // Corresponds to CHAR_ID (Foreign key from CHARACTER)
    private int gold;         // Corresponds to GOLD
    private int attunementSlots; // Corresponds to ATTUNEMENT_SLOTS
    private int usedAttunementSlots; // Corresponds to USED_ATTUNEMENT_SLOTS

    // Constructor to initialize the Inventory object
    public Inventory(int inventoryId, String charId, int gold, int attunementSlots, int usedAttunementSlots) {
        this.inventoryId = inventoryId;
        this.charId = charId;
        this.gold = gold;
        this.attunementSlots = attunementSlots;
        this.usedAttunementSlots = usedAttunementSlots;
    }

    // Getters and Setters for each attribute

    public int getInventoryId() {
        return inventoryId;
    }

    public void setInventoryId(int inventoryId) {
        this.inventoryId = inventoryId;
    }

    public String getCharId() {
        return charId;
    }

    public void setCharId(String charId) {
        this.charId = charId;
    }

    public int getGold() {
        return gold;
    }

    public void setGold(int gold) {
        this.gold = gold;
    }

    public int getAttunementSlots() {
        return attunementSlots;
    }

    public void setAttunementSlots(int attunementSlots) {
        this.attunementSlots = attunementSlots;
    }

    public int getUsedAttunementSlots() {
        return usedAttunementSlots;
    }

    public void setUsedAttunementSlots(int usedAttunementSlots) {
        this.usedAttunementSlots = usedAttunementSlots;
    }

    // Method to check if the attunement slots are valid
    public boolean isValidAttunement() {
        return usedAttunementSlots <= attunementSlots;
    }

    // toString() method to represent the Inventory object as a string
    @Override
    public String toString() {
        return "Inventory{" +
                "inventoryId=" + inventoryId +
                ", charId='" + charId + '\'' +
                ", gold=" + gold +
                ", attunementSlots=" + attunementSlots +
                ", usedAttunementSlots=" + usedAttunementSlots +
                '}';
    }
}
