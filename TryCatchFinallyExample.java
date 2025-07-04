public class TryCatchFinallyExample {
    public static void main(String[] args) {
        int[] numbers = {10, 0, 5};

        try {
            // Possible ArithmeticException: divide by zero
            int result = numbers[0] / numbers[1];
            System.out.println("Result: " + result);

            // Possible ArrayIndexOutOfBoundsException
            System.out.println("Accessing index 5: " + numbers[5]);

        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException caught: " + e.getMessage());

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException caught: " + e.getMessage());

        } catch (Exception e) {
            // Generic handler for any other exceptions
            System.out.println("General Exception caught: " + e.getMessage());

        } finally {
            // Always executes, whether exception is caught or not
            System.out.println("This is the finally block. It always runs!");
        }

        System.out.println("Program continues after try-catch-finally.");
    }
}
