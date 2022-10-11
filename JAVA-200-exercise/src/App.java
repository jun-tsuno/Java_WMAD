
//import child.*;
import grandChild.*;

public class App {
    public static void main(String[] args) {

        // Reptiles
        //Reptile reptile = new Reptile();
        //System.out.println(reptile);
        Crocodile crocodile = new Crocodile();
        System.out.println(crocodile);
        System.out.println(crocodile.info());

        // Fish
        // Fish fish = new Fish();
        // System.out.println(fish);
        Eel eel = new Eel();
        System.out.println(eel);
        System.out.println(eel.info());


        // Birds
        // Birds birds = new Birds();
        // System.out.println(birds);
        Eagle eagle = new Eagle();
        System.out.println(eagle);
        System.out.println(eagle.info());

    }
}
