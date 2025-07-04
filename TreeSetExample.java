import java.util.TreeSet;
import java.util.Iterator;

public class TreeSetExample {
    public static void main(String[] args) {
        // 1. Create a TreeSet of Integers
        TreeSet<Integer> numbers = new TreeSet<>();

        // 2. Add elements
        numbers.add(50);
        numbers.add(20);
        numbers.add(40);
        numbers.add(10);
        numbers.add(30);
        numbers.add(20); // duplicate, ignored

        // ❌ numbers.add(null); // NullPointerException

        // 3. Print (auto sorted)
        System.out.println("Sorted Numbers: " + numbers);

        // 4. First, Last, Higher, Lower
        System.out.println("First: " + numbers.first());
        System.out.println("Last: " + numbers.last());
        System.out.println("Higher than 25: " + numbers.higher(25)); // next greater
        System.out.println("Lower than 25: " + numbers.lower(25));   // next smaller

        // 5. Subset views
        System.out.println("\nHeadSet (< 30): " + numbers.headSet(30));
        System.out.println("TailSet (>= 30): " + numbers.tailSet(30));
        System.out.println("SubSet (20 to 40): " + numbers.subSet(20, 40)); // 20 inclusive, 40 exclusive

        // 6. Check existence
        System.out.println("\nContains 10? " + numbers.contains(10));
        System.out.println("Contains 99? " + numbers.contains(99));

        // 7. Remove element
        numbers.remove(10);
        System.out.println("After removing 10: " + numbers);

        // 8. Iterate
        System.out.println("\nAscending order:");
        for (int num : numbers) {
            System.out.println(num);
        }

        System.out.println("\nDescending order:");
        Iterator<Integer> desc = numbers.descendingIterator();
        while (desc.hasNext()) {
            System.out.println(desc.next());
        }

        // 9. Clear and isEmpty
        numbers.clear();
        System.out.println("\nAfter clear(): " + numbers);
        System.out.println("Is set empty? " + numbers.isEmpty());
    }
}
