import java.util.Scanner;

public class ConditionalExamples {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // === Example 1: if condition ===
        System.out.println("=== if Example ===");
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        if (number > 0) {
            System.out.println("The number is positive.");
        }

        // === Example 2: if-else condition ===
        System.out.println("\n=== if-else Example ===");
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        if (age >= 18) {
            System.out.println("You are eligible to vote.");
        } else {
            System.out.println("You are not eligible to vote.");
        }

        // === Example 3: switch-case ===
        System.out.println("\n=== switch Example ===");
        System.out.print("Enter a day number (1-7): ");
        int day = scanner.nextInt();

        switch (day) {
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Invalid day number.");
        }

        scanner.close(); // close the scanner to prevent resource leak
    }
}
