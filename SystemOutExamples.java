public class SystemOutExamples {
    public static void main(String[] args) {

        // 1. Using println() - prints a message followed by a newline
        System.out.println("=== Example: println ===");
        System.out.println("Hello, World!");
        System.out.println("This is printed on a new line.");

        // 2. Using print() - prints without a newline
        System.out.println("\n=== Example: print ===");
        System.out.print("This is ");
        System.out.print("on the same ");
        System.out.print("line.");
        System.out.println(); // manually moving to next line

        // 3. Using printf() - formatted output
        System.out.println("\n=== Example: printf ===");
        String name = "Parth";
        int age = 25;
        double score = 91.756;

        System.out.printf("Name: %s%n", name);      // %s for string
        System.out.printf("Age: %d%n", age);         // %d for integer
        System.out.printf("Score: %.2f%n", score);   // %.2f for float with 2 decimals
    }
}
