import java.util.Scanner;

public class StringBasics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Declaring and initializing strings
        String str1 = "Hello";
        String str2 = "World";

        // 2. Concatenation using '+' operator
        String combined = str1 + " " + str2;
        System.out.println("Concatenated String: " + combined);

        // 3. Taking string input from user
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();  // reads full line including spaces
        System.out.println("Welcome, " + name + "!");

        // 4. String immutability
        String original = "Java";
        original.concat(" Programming"); // this line has no effect!
        System.out.println("After concat (no change): " + original);

        // Correct way to update
        String updated = original.concat(" Programming");
        System.out.println("After concat (correct): " + updated);

        scanner.close();
    }
}
