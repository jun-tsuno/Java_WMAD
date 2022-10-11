package grandChild;


import child.Fish;

public class Eel extends Fish{

    private String defense;

    public Eel() {
        super(100, 50, "Fish", "A", "Water", true);
        this.defense = "Release electric charge";
    }

    public String info() {
        return "Delicious🤤";
    }

    @Override
    public String toString() {
        return
            "Eel [living=" + getLiving()+
            ", gills=" + isGills() +
            ", height=" + getHeight() +
            ", weight=" + getWeight() +
            ", animal type=" + getAnimalType() +
            ", blood type=" + getBloodType() +
            "]";
    }
}
