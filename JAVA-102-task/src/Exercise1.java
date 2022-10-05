import java.util.*;

public class Exercise1 {
    /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {

        Scanner scan1;
        int inputNum;
        double area;

        scan1 = new Scanner(System.in);

        System.out.print("Enter a number: ");
        inputNum = scan1.nextInt();
        area = (Math.pow(inputNum, 2) * Math.PI);

        System.out.println("The radius is: " + inputNum + " The area is: " + area);
    }
}