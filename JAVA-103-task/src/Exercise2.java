import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        int userInput;
        int sum = 0;

        Scanner scan = new Scanner(System.in);
        System.out.print("Input the N: ");
        userInput = scan.nextInt();

        for(int i = 1; i <= userInput; i++) {
            sum += i;
        }
        System.out.printf("The sum of 1 to %d is %d", userInput, sum);

        scan.close();
    }
}
