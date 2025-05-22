import java.util.Scanner;

public class AllInputOutputDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        System.out.print("Enter your height (in meters): ");
        double height = scanner.nextDouble();

        // Character input
        System.out.print("Enter your gender (M/F): ");
        char gender = scanner.next().charAt(0);

        System.out.println("\n--- Output ---");
        System.out.println("Name   : " + name);
        System.out.println("Age    : " + age);
        System.out.println("Height : " + height + " meters");
        System.out.println("Gender : " + gender);

        scanner.close();
    }
}
