import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) throws Exception {
        int userInput;

        List<Integer> list = new ArrayList<>();

        for(int i = 1; i <= 10; i++) {
            Random rand = new Random();
            int numRand = rand.nextInt(1,50);
            list.add(numRand);
        }
        System.out.println(list);

        Scanner scan1 = new Scanner(System.in);
        System.out.println("Enter a random number");
        userInput = scan1.nextInt();

        if(list.contains(userInput)) {
            System.out.println("The number is in the list!!");
        } else {
            System.out.println("Not in the list...");
        }

        scan1.close();
    }
}
