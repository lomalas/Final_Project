package App.Domain;

public class Trait {

    private int traitId;
    private String race;
    private String name;
    private String description;

    // Constructor to initialize the Trait object
    public Trait(int traitId, String race, String name, String description) {
        this.traitId = traitId;
        this.race = race;
        this.name = name;
        this.description = description;
    }

    // Getters and Setters for the attributes

    public int getTraitId() {
        return traitId;
    }

    public void setTraitId(int traitId) {
        this.traitId = traitId;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Trait{" +
                "traitId=" + traitId +
                ", race='" + race + '\'' +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
