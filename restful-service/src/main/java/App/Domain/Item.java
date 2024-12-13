package App.Domain;

public class Item {

    private int itemId;           // Corresponds to ITEM_ID
    private String itemName;      // Corresponds to ITEM_NAME
    private double weight;        // Corresponds to WEIGHT
    private String rarity;        // Corresponds to RARITY
    private String type;          // Corresponds to TYPE
    private int value;            // Corresponds to VALUE
    private String effect;        // Corresponds to EFFECT
    private String attunement;    // Corresponds to ATTUNEMENT
    private int quantity;         // Corresponds to QUANTITY
    private String magic;         // Corresponds to MAGIC
    private String description;   // Corresponds to DESCRIPTION

    // Constructor to initialize the Item object
    public Item(int itemId, String itemName, double weight, String rarity, String type, int value, String effect,
                String attunement, int quantity, String magic, String description) {
        this.itemId = itemId;
        this.itemName = itemName;
        this.weight = weight;
        this.rarity = rarity;
        this.type = type;
        this.value = value;
        this.effect = effect;
        this.attunement = attunement;
        this.quantity = quantity;
        this.magic = magic;
        this.description = description;
    }

    // Getters and Setters for each attribute

    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getRarity() {
        return rarity;
    }

    public void setRarity(String rarity) {
        this.rarity = rarity;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String getEffect() {
        return effect;
    }

    public void setEffect(String effect) {
        this.effect = effect;
    }

    public String getAttunement() {
        return attunement;
    }

    public void setAttunement(String attunement) {
        this.attunement = attunement;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getMagic() {
        return magic;
    }

    public void setMagic(String magic) {
        this.magic = magic;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    // toString() method to represent the Item object as a string
    @Override
    public String toString() {
        return "Item{" +
                "itemId=" + itemId +
                ", itemName='" + itemName + '\'' +
                ", weight=" + weight +
                ", rarity='" + rarity + '\'' +
                ", type='" + type + '\'' +
                ", value=" + value +
                ", effect='" + effect + '\'' +
                ", attunement='" + attunement + '\'' +
                ", quantity=" + quantity +
                ", magic='" + magic + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
