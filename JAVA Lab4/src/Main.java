import java.util.Scanner;

public class Main {

    static int firstNum;
    static int secondNum;
    static String operation;
    static String isQuit = "continue";
    static String askUser = "do you want to continue or quit?";

    public static void main(String[] args) {
        do {
            String guidance = "> Type + for addition\n"
            + "> Type - for subtraction\n"
            + "> Type * for multiplication\n"
            + "> Type / for division";

            Scanner scanFirst = new Scanner(System.in);
            System.out.println("Please type the first number");
            firstNum= scanFirst.nextInt();

            Scanner scanOpe = new Scanner(System.in);
            System.out.println(guidance);
            operation = scanOpe.nextLine();

            Scanner scanSecond = new Scanner(System.in);
            System.out.println("Please type the second number");
            secondNum = scanSecond.nextInt();

            // Summon the specific class depend on the operation.
            if(operation.equals("+")) {
                Calculate calculate = new Calculate(firstNum, secondNum, operation);
                System.out.println(calculate.add());
            }

            if(operation.equals("-")) {
                Calculate calculate = new Calculate(firstNum, secondNum, operation);
                System.out.println(calculate.subtract());
            }

            if(operation.equals("*")) {
                Calculate calculate = new Calculate(firstNum, secondNum, operation);
                System.out.println(calculate.multiply());
            }

            if(secondNum == 0 && operation.equals("/")) {
                System.out.println("cannot divide by zero");
            } else if(operation.equals("/")) {
                Calculate calculate = new Calculate(firstNum, secondNum, operation);
                System.out.println(calculate.divide());
            }

            // Ask user whether they will continue or quit.
            Scanner scanQuit = new Scanner(System.in);
            System.out.println(askUser);
            isQuit = scanQuit.nextLine();

            if(isQuit.equals("quit")) {
                System.out.println("Bye!");
            }
        } while(isQuit.equals("continue"));
    }

    public static int getFirstNum() {
        return firstNum;
    }

    public static void setFirstNum(int firstNum) {
        Main.firstNum = firstNum;
    }

    public static int getSecondNum() {
        return secondNum;
    }

    public static void setSecondNum(int secondNum) {
        Main.secondNum = secondNum;
    }

    public static String getOperation() {
        return operation;
    }

    public static void setOperation(String operation) {
        Main.operation = operation;
    }
}
