package App.Domain;

public class Species {

    private String speciesName;
    private String size;
    private int speed;
    private String description;

    // Constructor to initialize the Species object
    public Species(String speciesName, String size, int speed, String description) {
        this.speciesName = speciesName;
        this.size = size != null ? size : "Medium";  // Default to "Medium" if size is null
        this.speed = (speed >= 0) ? speed : 30;     // Default to 30 if speed is less than 0
        this.description = description;
    }

    // Getters and Setters for the attributes

    public String getSpeciesName() {
        return speciesName;
    }

    public void setSpeciesName(String speciesName) {
        this.speciesName = speciesName;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        if (speed >= 0) {
            this.speed = speed;
        } else {
            throw new IllegalArgumentException("Speed must be a non-negative value.");
        }
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Species{" +
                "speciesName='" + speciesName + '\'' +
                ", size='" + size + '\'' +
                ", speed=" + speed +
                ", description='" + description + '\'' +
                '}';
    }
}
