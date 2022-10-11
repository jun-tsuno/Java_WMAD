package child;

import parent.Animal;

public class Birds extends Animal{

    private String feature;
    private boolean canFly;

    public Birds() {
        super(0, 0, "Birds", "A");
        this.feature = "Feathers";
        this.canFly = true;
    }

    public Birds(int height, int weight, String animalType, String bloodType, String feature, boolean canFly) {
        super(height, weight, animalType, bloodType);
        this.feature = feature;
        this.canFly = canFly;
    }

    public String getFeature() {
        return feature;
    }

    public void setFeature(String feature) {
        this.feature = feature;
    }

    public boolean isCanFly() {
        return canFly;
    }

    public void setCanFly(boolean canFly) {
        this.canFly = canFly;
    }

    @Override
    public String toString() {
        return
            "Birds [features=" + feature+
            ", canFly=" + canFly +
            ", height=" + getHeight() +
            ", weight=" + getWeight() +
            ", animal type=" + getAnimalType() +
            ", blood type=" + getBloodType() +
            "]";
    }
}
