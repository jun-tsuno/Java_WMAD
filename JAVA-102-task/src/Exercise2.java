import java.util.*;

public class Exercise2 {

    public static void main(String[] args) {

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

    }
}
