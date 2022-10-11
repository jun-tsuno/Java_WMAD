package grandChild;

import child.Birds;

public class Eagle extends Birds {

    public Eagle() {
        super(60, 100, "Birds", "A", "feather", true);
    }

    public String info() {
        return "Dark brown with feathers covering their head.";
    }

    @Override
    public String toString() {
        return
            "Eagle [features=" + getFeature()+
            ", canFly=" +  isCanFly()+
            ", height=" + getHeight() +
            ", weight=" + getWeight() +
            ", animal type=" + getAnimalType() +
            ", blood type=" + getBloodType() +
            "]";
    }
}
