import java.util.ArrayList;

public class UnboxingExample {
    public static void main(String[] args) {
        // List of Integer objects (wrappers)
        ArrayList<Integer> list = new ArrayList<>();
        list.add(100);
        list.add(200);
        list.add(300);

        // Unboxing: automatically converting Integer to int
        int sum = 0;
        for (Integer item : list) {
            // item is Integer, used as int ➜ unboxed
            sum += item;
        }

        System.out.println("Sum of all numbers: " + sum);

        // Manual unboxing also possible
        Integer boxed = 500;
        int unboxed = boxed.intValue(); // explicit unboxing
        System.out.println("Unboxed value: " + unboxed);
    }
}
