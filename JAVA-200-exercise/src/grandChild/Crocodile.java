package grandChild;

import child.Reptile;

public class Crocodile extends Reptile{

    public Crocodile() {
        super(21, 1000, "Reptile", "A", "Dry-Skin", "Backbone", "Hard-shelled");
    }

    public String info() {
        return "Extremely dangerous😵🐊";
    }

    @Override
    public String toString() {
        return "Crocodile [skinType=" + getSkinType() +
        ", bone=" + getBone() +
        ", eggType=" + getEggType() +
        ", height=" + getHeight() +
        ", weight=" + getWeight() +
        ", animal type=" + getAnimalType() +
        ", blood type=" + getBloodType() +
        "]";
    }
}
