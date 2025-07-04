import java.util.Arrays;
import java.util.Scanner;

public class ArrayOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: size and array elements
        System.out.print("Enter size of array: ");
        int size = scanner.nextInt();
        int[] arr = new int[size];

        System.out.println("Enter " + size + " integers:");
        for (int i = 0; i < size; i++) {
            System.out.print("Element " + i + ": ");
            arr[i] = scanner.nextInt();
        }

        // 1. Sum of all elements
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        System.out.println("\nSum of elements: " + sum);

        // 2. Find maximum element
        int max = arr[0];
        for (int num : arr) {
            if (num > max) {
                max = num;
            }
        }
        System.out.println("Maximum value: " + max);

        // 3. Reverse the array
        System.out.print("Reversed array: ");
        for (int i = size - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        // 4. Sort the array in ascending order
        Arrays.sort(arr);
        System.out.println("Sorted array (ascending): " + Arrays.toString(arr));

        scanner.close();
    }
}
