import java.io.IOException;

public class ThrowThrowsExample {
    public static void main(String[] args) {
        System.out.println("=== Example of throw ===");
        try {
            validateAge(15); // triggers throw
        } catch (IllegalArgumentException e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }

        System.out.println("\n=== Example of throws ===");
        try {
            riskyMethod(); // declared to throw IOException
        } catch (IOException e) {
            System.out.println("Handled IOException from riskyMethod: " + e.getMessage());
        }
    }

    // -----------------------------------
    // 1. throw — used to actually throw an exception
    // -----------------------------------
    public static void validateAge(int age) {
        if (age < 18) {
            // Manually throw exception
            throw new IllegalArgumentException("Age must be 18 or above.");
        }
        System.out.println("Age is valid: " + age);
    }

    // -----------------------------------
    // 2. throws — used to declare a method might throw exception
    // -----------------------------------
    public static void riskyMethod() throws IOException {
        // Simulate a condition that causes an exception
        boolean fileProblem = true;

        if (fileProblem) {
            throw new IOException("File not found or cannot read.");
        }

        System.out.println("File read successfully.");
    }
}
