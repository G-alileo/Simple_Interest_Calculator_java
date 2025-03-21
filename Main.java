import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        // declaring variables
        boolean validity = true;
        int user_choice = 2;

        // creating an obj
        Main my_obj = new Main();
        Scanner Sc = new Scanner(System.in);

        // initializing infinite loop
        while (validity) {
            // System.out.println("Welcome to the simple interest calculator ");
            System.out.print("\n===========================================================================================\n");
            System.out.println("\t\tMenu");
            System.out.println("\n\t1. Start the calculator. ");
            System.out.println("\t2. Exit ");
            System.out.print("\nYour choice : ");

            // Validating user input
            try {
                user_choice = Sc.nextInt();

                switch (user_choice) {
                    case 1:
                        my_obj.LogicMethod(Sc);
                        break;
        
                    case 2:
                        validity = false;
                        Sc.close();
                        System.out.println("Exiting ..... Goodbye!");
                        System.out.print("\n===========================================================================================\n");
                        break;
                
                    default:
                        System.out.println("Error : Invalid choice! Out of Bound");
                        break;
                }
                
            } catch (InputMismatchException e) {
                System.out.println("Error : Invalid input ! Type Error");
                Sc.nextLine();
            }

        }

        Sc.close();
    }


    // A method to calculate simple interest
    public double SimpleInterest (double principle, double rate, double time) {
    return (principle * rate *time) / 100 ;   
    }

    // A method to validate user input
    public void LogicMethod(Scanner user_val){
        // initializing variables
        double principle, rate, time, simpleinterest;
        principle = rate =  time = 0;
        boolean validity = true;
    
        // creating intances of the classes am to use
        Main obj = new Main();
        

        //Starting a loop
        while (validity) {
                //Taking user input
            try {
                System.out.print("===========================================================================================");
                System.out.println("\n\t\tWelcome to the Simple Interest Calculator.");
                System.out.print("Enter the Principle : ");
                principle = user_val.nextDouble();
                
            } catch (InputMismatchException e) {
                System.out.println("Error : Invalid input type!");
                user_val.nextLine();  // Clearing the scanner class
                break;
            }


            try {
                System.out.println();
                System.out.print("Enter your rate : ");
                rate = user_val.nextDouble();
            } catch (InputMismatchException e) {
                System.out.println("Error : Invalid input type!");
                user_val.nextLine();
                break;

            }


            try {
                System.out.println();
                System.out.print("Enter your time in years : ");
                time = user_val.nextDouble();
                System.out.print("\n===========================================================================================");

            } catch (InputMismatchException e) {
                System.out.println("Error : Invalid input type!");
                user_val.nextLine(); 
                break;

            }

            //calculating the simple interest
            simpleinterest =  obj.SimpleInterest(principle, rate, time);
    
            // display the results
            System.out.println("\n\t\tResults ");
            System.out.println("\n\tPrinciple = " +"KSH " + principle );
            System.out.println("\tRate = " + rate + " %");
            System.out.println("\tTime = " + time + " yr(s)");
            System.out.println("\tSimple Interest = " + "KSH "  + simpleinterest );
            System.out.print("\n===========================================================================================\n");
            validity = false;
            // user_val.close();
        } 
    }
    
}