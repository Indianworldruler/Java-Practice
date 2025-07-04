public class BreakContinueExample {
    public static void main(String[] args) {
        System.out.println("Looping numbers from 1 to 10");

        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                System.out.println("Skipping number 5 using continue");
                continue; // Skip the rest of the loop when i is 5
            }

            if (i == 8) {
                System.out.println("Breaking the loop at number 8 using break");
                break; // Exit the loop completely when i is 8
            }

            System.out.println("Number: " + i);
        }

        System.out.println("Loop ended.");
    }
}
