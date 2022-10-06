import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        int [] numArr;
        int length;
        int inputSum = 0;

        Scanner initialScan = new Scanner(System.in);
        System.out.println("How many integers will you be added?");
        length = initialScan.nextInt();

        numArr = new int[length];

        for(int i = 0; i<length; i++) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter an integer:");
            int userInput = scan.nextInt();
            numArr[i] = userInput;
        }

        for(int num: numArr) {
            inputSum += num;
        }

        System.out.println("The sum is " +inputSum);
    }
}
