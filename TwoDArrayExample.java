import java.util.Scanner;

public class TwoDArrayExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Declare a 2D array (3 rows x 3 columns)
        int[][] matrix = new int[3][3];

        // 2. Input elements
        System.out.println("Enter 9 integers for a 3x3 matrix:");
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.print("Element at [" + row + "][" + col + "]: ");
                matrix[row][col] = scanner.nextInt();
            }
        }

        // 3. Display the matrix
        System.out.println("\nMatrix:");
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.print(matrix[row][col] + "\t");
            }
            System.out.println();
        }

        // 4. Sum of each row
        System.out.println("\nSum of each row:");
        for (int row = 0; row < 3; row++) {
            int rowSum = 0;
            for (int col = 0; col < 3; col++) {
                rowSum += matrix[row][col];
            }
            System.out.println("Row " + row + " sum = " + rowSum);
        }

        scanner.close();
    }
}
