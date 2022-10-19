import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class Q3 {
    public static void main(String[] args) {

        List<Car> carList = new ArrayList<>();

        carList.add(new Car("Audi", "A3", 2022));
        carList.add(new Car("Mercedes-Benz", "190E", 1993));
        carList.add(new Car("Jaguar", "XE", 2020));

        Collections.sort(carList);

        for(Car i : carList) {
            System.out.println(i.brand + " : " + i.model + " : " + i.year);
        }
    }
}

// user-defined type
class Car implements Comparable<Car> {
    String brand;
    String model;
    int year;

    public Car(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    @Override
    public int compareTo(Car o) {
        return this.year - o.year;
    }
}

