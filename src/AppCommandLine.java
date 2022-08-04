import java.util.InputMismatchException;
import java.util.Scanner;

public class AppCommandLine {

    public static void startup() {
        CommandLineInterface cli = new CommandLineInterface();
        int choice;
        Scanner scanner = new Scanner(System.in);

        while (true) {
            cli.displayOptions();
            System.out.println("Please select option 1 to calculate else option 2 to quit: ");
            choice = 0;
            try {
                choice = Integer.parseInt(scanner.nextLine());
                if (choice > 2 || choice < 1) {
                    throw new InputMismatchException("Please enter valid choice (1 for calculation and 2 to quit)");
                }
            } catch (InputMismatchException | NumberFormatException e) {
                System.out.println("Input error: Please enter valid numeric choice.");
            }


            switch (choice) {
                case 1:
                    cli.inputWindow();
                    Scanner sc = new Scanner(System.in);
                    String a, b, x;
                    System.out.print("Enter value for a = ");
                    a = sc.next();
                    a = isValidInputForA(a);
                    while (a == null) {
                        System.out.print("Enter value for a =  ");
                        a = sc.next();
                        a = isValidInputForA(a);
                    }

                    System.out.print("Enter value for b = ");
                    b = sc.next();
                    b = isValidInputForB(b);
                    while (b == null) {
                        System.out.print("Enter value for b = ");
                        b = sc.next();
                        b = isValidInputForB(b);
                    }
                    System.out.print("Enter value for x = ");
                    x = sc.next();
                    x = isValidInputForX(x);
                    while (x == null || x.equals("e")) {
                        System.out.print("Enter value for x = ");
                        x = sc.next();
                        x = isValidInputForX(x);
                    }

                    String result = ScientificCalculator.calculateExponentialFunction(a, b, x);
                    startup();
                    break;
                case 2:
                    cli.quitWindow();
                    System.exit(0);
            }


        }
    }

    public static String isValidInputForA(String input) {
        try {
            double temp = Double.parseDouble(input);
            if (temp > -10000 && temp <= 10000 && temp != 0) {
                return input;
            } else {
                System.out.println("Please provide input for A lying in range -100000<a<100000 and a should not be equal to 0.");
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid Input for a: " + e);
        }
        System.out.println("Please enter value for a again.");
        return null;
    }

    public static String isValidInputForB(String input) {
        if (input.equals("e")) {
            return input;
        } else {
            try {
                double temp = Double.parseDouble(input);
                if (temp > 0 && temp <= 10000 && temp != 1) {
                    return input;
                } else {
                    System.out.println("Base b is restricted to positive number and b should not be equal to 1, in order to guarantee that b^x is real number.Please provide input for B lying in range 0<b<100000");
                }

            } catch (NumberFormatException e) {
                System.out.println("Invalid Input for b: " + e);
            }
            System.out.println("Please enter value for b again.");
            return null;
        }
    }

    public static String isValidInputForX(String input) {
        try {
            double temp = Double.parseDouble(input);
            if (temp > -10000 && temp <= 10000) {
                return input;
            } else {
                System.out.println("Please provide input for X lying in range -100000<x<100000");
            }

        } catch (NumberFormatException e) {
            System.out.println("Invalid Input for x: " + e);
        }
        System.out.println("Please enter value for x again.");
        return null;

    }

    public static void main(String[] args) {
        System.out.println("----Loading System----");
        startup();
    }
}

