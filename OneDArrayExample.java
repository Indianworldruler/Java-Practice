import java.util.Scanner;

public class OneDArrayExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Declare and initialize an array of size 5
        int[] numbers = new int[5];

        // 2. Input values into the array
        System.out.println("Enter 5 integers:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Element " + i + ": ");
            numbers[i] = scanner.nextInt();
        }

        // 3. Display all elements
        System.out.println("\nYou entered:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Element at index " + i + ": " + numbers[i]);
        }

        // 4. Sum of all elements
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        System.out.println("\nSum of all elements: " + sum);

        scanner.close();
    }
}
