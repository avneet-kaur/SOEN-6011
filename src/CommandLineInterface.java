public class CommandLineInterface {


    private static String printStars() {
        return "******************************************************";
    }

    public static void displayOptions() {
        StringBuilder str = new StringBuilder();
        str.append(printStars()).append("\n");
        str.append("Main Menu!\n");
        str.append(printStars()).append("\n");
        str.append("1. ab^x\n");
        str.append("2. Quit\n");
        str.append(printStars());
        System.out.println(str.toString());
    }


    public static void inputWindow() {
        System.out.println(printStars());
        System.out.println("To calculate for ab^x, please enter value for a, b and x delimited by enter key.");
    }

    public static void quitWindow() {
        System.out.println(printStars());
        System.out.println("You have chosen to exit from the system. Goodbye!");
        System.out.println(printStars());
    }

}
