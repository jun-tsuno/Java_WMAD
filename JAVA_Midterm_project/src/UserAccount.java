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

    public void getCanceled() {
        flightDestination = "NOT BOOKED YET";
        flightDeparture = "NOT BOOKED YET";
        flightDate = "NOT BOOKED YET";
        flightNum = 0;
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
                    "C: Cancel Booking\n"+
                    "D: Exit\n"+
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
                            System.out.println("Departure: Enter city:  (ex) NewYork ");
                            userDeparture = userInput.nextLine();
                            System.out.println("Destination: Enter city:");
                            userDestination= userInput.next();
                        } catch(Exception e) {
                            errorMessage("Wrong Input! Only String please.");
                        }

                        try{
                            System.out.println("When do you depart? Year: (ex) 2022");
                            userYear = userInput.nextInt();
                            System.out.println("When do you depart? Month: (ex) 12");
                            userMonth = userInput.nextInt();
                            System.out.println("When do you depart? Day: (ex)31");
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

                    case 'c':
                        char isCancel;
                        Scanner inputCancel = new Scanner(System.in);
                        System.out.println("-------------------------------");
                        System.out.println("Cancel Booking");
                        System.out.println("-------------------------------");
                        System.out.println("\n<<<Your current Booking>>>\n"+ "\n"+
                            " Departure    : " +flightDeparture.toUpperCase()+"\n"+
                            "Destination   : " +flightDestination.toUpperCase()+"\n"+
                            "    Date      : " +flightDate+ "\n"+
                            "Flight Number : " +flightNum+"\n"+
                            "\nCancel this flight ---> Enter [y]\nQuit ---> Enter [q]"
                        );
                        isCancel = inputCancel.next().charAt(0);
                        switch(Character.toLowerCase(isCancel)) {
                            case 'y':
                                getCanceled();
                                System.out.println("===================");
                                System.out.println("Transaction Success");
                                System.out.println("===================");
                            case 'q':
                                break;
                            default:
                                System.out.println("Caution! Invalid input. ***Your reservation is still valid***");
                                break;
                        }
                        break;

                    case 'd':
                        break;

                    default:
                        System.out.println("Invalid option. Please try again.");
                        break;
                }

            } while (Character.toLowerCase(option) != 'd');

            System.out.println("<<<Thank you for using us! See you next time!>>>");
            System.exit(0);
        };
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public String getFlightDestination() {
        return flightDestination;
    }

    public void setFlightDestination(String flightDestination) {
        this.flightDestination = flightDestination;
    }

    public String getFlightDeparture() {
        return flightDeparture;
    }

    public void setFlightDeparture(String flightDeparture) {
        this.flightDeparture = flightDeparture;
    }

    public String getFlightDate() {
        return flightDate;
    }

    public void setFlightDate(String flightDate) {
        this.flightDate = flightDate;
    }

    public int getFlightNum() {
        return flightNum;
    }

    public void setFlightNum(int flightNum) {
        this.flightNum = flightNum;
    }
}


