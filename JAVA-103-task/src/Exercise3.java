import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        String userWord;
        int i = 1;

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a word: ");
        userWord = scan.next();

        int length = userWord.length();

        do {
            System.out.println(userWord);
            i++;
        }
        while(i <= length);

        scan.close();
    }
}
