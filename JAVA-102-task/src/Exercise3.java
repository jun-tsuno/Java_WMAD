import java.util.*;

public class Exercise3 {
    public static void main(String[] args) {

        Scanner scan3;
        int inputNum3;

        scan3 = new Scanner(System.in);

        System.out.print("Input a number: ");
        inputNum3 = scan3.nextInt();

        for(int i = 1; i <= 10; i++) {
            System.out.println(inputNum3 + " x " + i + " = " + inputNum3 * i);
        }
    }
}
