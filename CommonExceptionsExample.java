public class CommonExceptionsExample {
    public static void main(String[] args) {
        System.out.println("=== NullPointerException Example ===");
        handleNullPointer();

        System.out.println("\n=== ArrayIndexOutOfBoundsException Example ===");
        handleArrayIndexOutOfBounds();

        System.out.println("\nProgram completed successfully.");
    }

    // -----------------------------------------------
    // 1. Demonstrates NullPointerException
    // -----------------------------------------------
    public static void handleNullPointer() {
        String message = null; // message is declared but not initialized

        try {
            // Trying to access length of a null string
            System.out.println("Length of message: " + message.length());
        } catch (NullPointerException e) {
            System.out.println("❌ Caught NullPointerException!");
            System.out.println("Message: " + e.getMessage());
        }

        // Preventive solution
        message = "Hello";
        if (message != null) {
            System.out.println("✅ Safe length access: " + message.length());
        }
    }

    // -----------------------------------------------
    // 2. Demonstrates ArrayIndexOutOfBoundsException
    // -----------------------------------------------
    public static void handleArrayIndexOutOfBounds() {
        int[] numbers = {10, 20, 30};

        try {
            // Trying to access index 5, which doesn't exist (only 0–2 are valid)
            System.out.println("Value at index 5: " + numbers[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("❌ Caught ArrayIndexOutOfBoundsException!");
            System.out.println("Message: " + e.getMessage());
        }

        // Preventive solution
        int index = 2;
        if (index >= 0 && index < numbers.length) {
            System.out.println("✅ Safe array access at index " + index + ": " + numbers[index]);
        }
    }
}
