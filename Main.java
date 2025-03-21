import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        // initializing variables
        double principle, rate, time, simpleinterest;
        principle = rate =  time = 0;

        // creating intances of the classes am to use
        Scanner user_val = new Scanner(System.in);
        Main obj = new Main();

        //Taking user input
        try {
            System.out.println("Welcome to the Simple Interest Calculator.");
            System.out.println("Enter the Principle : ");
            principle = user_val.nextDouble();
        } catch (InputMismatchException e) {
            // TODO: handle exception
            System.out.println("Error : Invalid input type!");
            user_val.nextLine();  // Clearing the scanner class
        }


        try {
            System.out.println("Welcome to the Simple Interest Calculator.");
            System.out.println("Enter your rate : ");
            rate = user_val.nextDouble();
        } catch (InputMismatchException e) {
            // TODO: handle exception
            System.out.println("Error : Invalid input type!");
            user_val.nextLine();

        }


        try {
            System.out.println("Welcome to the Simple Interest Calculator.");
            System.out.println("Enter your time in years : ");
            time = user_val.nextDouble();
        } catch (InputMismatchException e) {
            // TODO: handle exception
            System.out.println("Error : Invalid input type!");
            user_val.nextLine(); 

        }

        //calculating the simple interest
        simpleinterest =  obj.SimpleInterest(principle, rate, time);

        // display the results
        System.out.println("Results ");
        System.out.println("Principle = " + principle);
        System.out.println("Rate = " + rate + " /100");
        System.out.println("Time = " + time + "yr(s)");
        System.out.println("Simple Interest = " + simpleinterest );

    }

    // A method to calculate simple interest
    public double SimpleInterest (double principle, double rate, double time) {
    return (principle * rate *time) / 100 ;   
    }

    // A method to validate user input
    
}