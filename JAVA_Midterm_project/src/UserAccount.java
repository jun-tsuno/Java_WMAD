import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.ErrorManager;

public class UserAccount {

    private String userName;
    private String userPassword;
    public String flightDestination = "not booked yet";
    public String flightDeparture = "not booked yet";
    public String flightDate = "NOT BOOKED YET";
    public int flightNum;

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

    public class CurrentBooking {
        String departure;
        String destination;
        String date;
        int flightNum;

        public CurrentBooking(String departure, String destination, String date, int flightNum) {
            this.departure = departure;
            this.destination = destination;
            this.date = date;
            this.flightNum = flightNum;
        }
    }

    public void Booking(String departure, String destination, int year, int month, int day, int flightNum) {

        System.out.println("==================================================");
        System.out.println(
            "<<<<Booking Completed >>>\n" +
            "Departure:" + departure.toUpperCase() + " ==> " + "Destination: " + destination.toUpperCase()
            +"\nBooking Date: " +year + "-" +month + "-" +day
            +"\nFlight Number:" +flightNum
        );
        System.out.println("==================================================");

    }

    void errorMessage(String message) {
        System.out.println(message);
    }

    public void showMenu() {
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
                        System.out.println("Your next flight information");
                        System.out.println("-------------------------------");
                        System.out.println("\n"+
                            " Departure    : " +flightDeparture.toUpperCase()+"\n"+
                            "Destination   : " +flightDestination.toUpperCase()+"\n"+
                            "    Date      : " +flightDate+ "\n"+
                            "Flight Number : " +flightNum+"\n"
                        );
                        break;

                    case 'b':
                        System.out.println("-------------------------------");
                        System.out.println("Booking");
                        System.out.println("-------------------------------");

                        Scanner userInput = new Scanner(System.in);
                        String userDeparture = null;
                        String userDestination = null;
                        int userYear = 0000;
                        int userMonth = 00;
                        int userDay = 00;

                        try{
                            System.out.println("Departure: Enter city");
                            userDeparture = userInput.nextLine();
                            System.out.println("Destination: Enter city");
                            userDestination= userInput.next();
                        } catch(Exception e) {
                            errorMessage("Wrong Input! Only String please.");
                        }

                        try{
                            System.out.println("When do you depart? Year: ");
                            userYear = userInput.nextInt();
                            System.out.println("When do you depart? Month: ");
                            userMonth = userInput.nextInt();
                            System.out.println("When do you depart? Day: ");
                            userDay = userInput.nextInt();

                            if(userYear <= 0 || userYear < 2022 || userMonth <= 0 || userMonth > 12 || userDay <= 0 || userDay > 31) {
                                System.out.println("Invalid Input! Check out your input!");
                                break;
                            } else if (userYear > 2027) {
                                System.out.println("Sorry, you can only book for 5 years...");
                                break;
                            }
                        } catch(Exception e) {
                            errorMessage("Wrong Input! Only Integer please.");
                        }

                        String date = userYear +"-"+ userMonth +"-"+ userDay;
                        int flight = (int) Math.floor(Math.random() * 100);
                        Booking(userDeparture, userDestination, userYear, userMonth, userDay, flight);

                        flightDeparture = userDeparture;
                        flightDestination = userDestination;
                        flightDate = date;
                        flightNum = flight;

                        // Booking(userDeparture, userDestination, userYear, userMonth, userDay);
                        break;

                    default:
                        System.out.println("Invalid option. Please try again.");
                        break;
                }

            } while (Character.toLowerCase(option) != 'c');

            System.out.println("Thank you for using us! See you next time!");
            System.exit(0);
        };
    };
}


