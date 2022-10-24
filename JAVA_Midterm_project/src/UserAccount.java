import java.util.Scanner;
import java.util.logging.ErrorManager;

public class UserAccount {

    private String userName;
    private String userPassword;


    public UserAccount() {

    }

    public UserAccount(String userName, String userPassword) {
        this.userName = userName;
        this.userPassword = userPassword;
    }

    public String getUserName() {
        return userName;
    }

    public String getUserPassword() {
        return userPassword;
    }


    class CurrentBooking {
        String destination;
        String date;
        int flightNum;

        public CurrentBooking(String destination, String date, int flightNum) {
            this.destination = destination;
            this.date = date;
            this.flightNum = flightNum;
        }
    }


    void Booking(String departure, String destination, int year, int month, int date) {
        int flightNum = (int) Math.floor(Math.random() * 100);

        System.out.println("[Your booking]");
        System.out.println("=======================================================");
        System.out.println(
            "Departure:" + departure.toUpperCase() + " ==> " + "Destination: " + destination.toUpperCase()
            +"\nBooking Date: " +year + "/" +month + "/" +date
            +"\nFlight Number:" +flightNum
        );
        System.out.println("=======================================================");
    }

    void errorMessage(String message) {
        System.out.println(message);
    }

    void showMenu() {
        char option;
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Welcome back, " + userName);
            do{
                System.out.println(
                    "=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=\n"+
                    "Select an option from the menu\n"+
                    "A: Upcoming Flights\n"+
                    "B: Booking\n"+
                    "C: Exit\n"+
                    "=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*="
                );
                option = input.next().charAt(0);

                App.clrscr();

                switch(Character.toLowerCase(option)) {

                    case 'a':
                        System.out.println("-------------------------------");
                        System.out.println("You have 3 reservations");
                        System.out.println("-------------------------------");

                    case 'b':
                        System.out.println("-------------------------------");
                        System.out.println("Booking");
                        System.out.println("-------------------------------");

                        Scanner userInput = new Scanner(System.in);
                        String userDeparture = "hoge";
                        String userDestination = "hogege";
                        int userYear = 0000;
                        int userMonth = 00;
                        int userDate = 00;

                        try{
                            System.out.println("Departure: Enter city");
                            userDeparture = userInput.nextLine();
                            System.out.println("Destination: Enter city");
                            userDestination= userInput.nextLine();
                            // BookingDestination(departure, destination);
                        } catch(Exception e) {
                            errorMessage("Wrong Input! Only String please.");
                        }

                        try{
                            System.out.println("When do you depart? Year: ");
                            userYear = userInput.nextInt();
                            System.out.println("When do you depart? Month: ");
                            userMonth = userInput.nextInt();
                            System.out.println("When do you depart? Date: ");
                            userDate = userInput.nextInt();
                            // BookingDate(year, month, date);
                        } catch(Exception e) {
                            errorMessage("Wrong Input! Only Integer please.");
                        }

                        Booking(userDeparture, userDestination, userYear, userMonth, userDate);
                        break;

                    default:
                        System.out.println("Invalic option. Please try again.");
                        break;
                }

            } while (Character.toLowerCase(option) != 'c');

            System.out.println("Thank you for using us! See you next time!");
            System.exit(0);
        };
    };
}


