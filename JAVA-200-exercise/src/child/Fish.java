package child;

import parent.Animal;

public class Fish extends Animal {

    private String living;
    private boolean gills;


    public Fish() {
        super(0, 0, "Fish", "A");
        this.living = "Water";
        this.gills = true;
    }

    public Fish(int height, int weight, String animalType, String bloodType, String living, boolean gills) {
        super(height, weight, animalType, bloodType);
        this.living = living;
        this.gills = gills;
    }

    public String getLiving() {
        return living;
    }

    public void setLiving(String living) {
        this.living = living;
    }

    public boolean isGills() {
        return gills;
    }

    public void setGills(boolean gills) {
        this.gills = gills;
    }

    @Override
    public String toString() {
        return
            "Fish [living=" + living+
            ", gills=" + gills +
            ", height=" + getHeight() +
            ", weight=" + getWeight() +
            ", animal type=" + getAnimalType() +
            ", blood type=" + getBloodType() +
            "]";
    }
}

