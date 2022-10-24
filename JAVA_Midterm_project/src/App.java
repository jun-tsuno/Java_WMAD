import java.util.Scanner;
import java.io.IOException;

public class App {

    /*---
     * username, password
     * upcoming flight
     * book flights(input: from/to, day  confirmation, cancel)
     * cancel a flight
     * exitAccount
    ---*/
    public static void main(String[] args) throws Exception {

        try(Scanner input = new Scanner(System.in)) {

            UserAccount userAccount = new UserAccount("hoge", "password");

            System.out.println("=================================");
            System.out.println("Welcome to ABC Air Line");
            System.out.println("=================================");

            while(true) {
                clrscr();
                System.out.println("Please enter your username");
                String user = input.nextLine();
                System.out.println("Please enter your password");
                String password = input.nextLine();

                if(user.equals(userAccount.getUserName()) && password.equals(userAccount.getUserPassword())) {
                    // System.out.println("Welcome back, " + user);
                    break;
                }

                System.out.println("Invalid credentials\nPress [enter] key to try again or press [Q] to quit");

                if(input.nextLine().toLowerCase().equals("q")){
                }

            }
            clrscr();
            userAccount.showMenu();
        }

    }

    public static void clrscr() {
        try {
			if (System.getProperty("os.name").contains("Windows"))
				new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
			else
				Runtime.getRuntime().exec("clear");
				System.out.print("\033\143");
		} catch (IOException | InterruptedException ex) {}
    }
}
