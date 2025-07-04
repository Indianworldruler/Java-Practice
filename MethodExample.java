public class MethodExample {

    // Method without return, no parameters
    public static void greet() {
        System.out.println("Hello! Welcome to Java Methods.");
    }

    // Method with parameters, no return
    public static void printSum(int a, int b) {
        int sum = a + b;
        System.out.println("Sum of " + a + " and " + b + " is: " + sum);
    }

    // Method with return value
    public static int square(int number) {
        return number * number;
    }

    public static void main(String[] args) {
        // Calling a method without parameters
        greet();

        // Calling a method with parameters
        printSum(5, 7);

        // Calling a method that returns a value
        int result = square(4);
        System.out.println("Square of 4 is: " + result);
    }
}
