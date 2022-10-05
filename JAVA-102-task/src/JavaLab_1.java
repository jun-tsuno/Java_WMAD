import java.util.*;

public class JavaLab_1 {
    /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {

// ## 1 — Find the Area of a Circle-----------------------------

    Scanner scan1;
    int inputNum;
    double area;

    scan1 = new Scanner(System.in);

    System.out.print("Enter a number: ");
    inputNum = scan1.nextInt();
    area = (Math.pow(inputNum, 2) * Math.PI);

    System.out.println("The radius is: " + inputNum + " The area is: " + area);


// ## 2 — Convert Cents to Dollars-----------------------------

        Scanner scan2;
        int inputNum2;
        int dollers;
        int cents;

        scan2 = new Scanner(System.in);

        System.out.print("Input the cents: ");
        inputNum2 = scan2.nextInt();
        dollers = inputNum2 / 100;
        cents = inputNum2 % 100;

        System.out.println("The value is " + dollers + " dollars " + "and " + cents + " cents.");


// ## 3 - Multiplication Table-----------------------------

        Scanner scan3;
        int inputNum3;

        scan3 = new Scanner(System.in);

        System.out.print("Input a number: ");
        inputNum3 = scan3.nextInt();

        for(int i = 1; i <= 10; i++) {
            System.out.println(inputNum3 + " x " + i + " = " + inputNum3 * i);
        }


// ## 4 - Print the Pattern-----------------------------

            // System.out.printf("%S");

            System.out.printf("%1$4s %2$6s %3$9s %4$3s %n",  "J", "a", "v     v", "a");
            System.out.printf("%1$4s %2$7s %3$7s %4$5s %n" , "J", "a a", "v   v" , "a a");
            System.out.printf("%1$4s %2$8s %3$5s %4$7s %n" , "J  J", "aaaaa", "V V" , "aaaaa");
            System.out.printf("%1$3s %2$10s %3$3s %4$9s %n" , "JJ", "a     a", "V" , "a     a");

    }
}