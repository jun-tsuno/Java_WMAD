import java.util.*;
import javax.security.sasl.SaslException;;


public class Exercise1 {
    public static void main(String[] args) throws Exception {

    int start;
    int end;

    Scanner scan1 = new Scanner(System.in);
    System.out.print("Input the start: ");
    start = scan1.nextInt();
    Scanner scan2 = new Scanner(System.in);
    System.out.print("Input the End: ");
    end = scan2.nextInt();

    for(int i = start; i <= end; i++) {
        System.out.println(i);
    }

    scan1.close();
    scan2.close();
    }
}
