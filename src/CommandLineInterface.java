/**
 * This class is helper class for command line interface functionality
 */
public class CommandLineInterface {

    /**
     *  Functions used to display options on command line.
     */
    public static void displayOptions() {
        System.out.println("******************************************************");
        System.out.println("Main Menu!\n");
        System.out.println("******************************************************");
        System.out.println("1. ab^x\n");
        System.out.println("******************************************************");
        System.out.println("2. Quit\n");
    }


    /**
     * Prompting window asking user to enter values.
     */
    public static void inputWindow() {
        System.out.println("******************************************************");
        System.out.println("To calculate for ab^x, please enter value for a, b and x delimited by enter key.");
    }

    /**
     * Function to exit from application.
     */
    public static void quitWindow() {
        System.out.println("******************************************************");
        System.out.println("You have chosen to exit from the system. Goodbye!");
        System.out.println("******************************************************");
    }

}
