public class ParametersAndReturnValues {

    // Method with parameters only (no return)
    public static void greetUser(String name) {
        System.out.println("Hello, " + name + "!");
    }

    // Method with return value only (no parameters)
    public static int getRandomNumber() {
        return 42; // For simplicity, returning a fixed number
    }

    // Method with both parameters and return value
    public static int multiply(int a, int b) {
        return a * b;
    }

    public static void main(String[] args) {
        // Call method with parameter only
        greetUser("Parth");

        // Call method with return value only
        int random = getRandomNumber();
        System.out.println("Random number: " + random);

        // Call method with parameters and return value
        int product = multiply(6, 7);
        System.out.println("6 x 7 = " + product);
    }
}
