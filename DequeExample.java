import java.util.ArrayDeque;
import java.util.Deque;

public class DequeExample {
    public static void main(String[] args) {
        // 1. Create a Deque
        Deque<String> deque = new ArrayDeque<>();

        // 2. Add elements at both ends
        deque.addFirst("Front1");
        deque.addLast("Back1");
        deque.addFirst("Front2");
        deque.addLast("Back2");

        System.out.println("Deque: " + deque); // Front2 → Front1 → Back1 → Back2

        // 3. Peek first and last
        System.out.println("First: " + deque.peekFirst());
        System.out.println("Last: " + deque.peekLast());

        // 4. Remove first and last
        System.out.println("Removed first: " + deque.removeFirst());
        System.out.println("Removed last: " + deque.removeLast());
        System.out.println("Deque after removals: " + deque);

        // 5. Check size and contains
        System.out.println("Contains 'Back1'? " + deque.contains("Back1"));
        System.out.println("Size: " + deque.size());

        // 6. Stack behavior (push/pop from front)
        deque.push("NewTop"); // same as addFirst
        System.out.println("After push(): " + deque);
        System.out.println("Pop(): " + deque.pop()); // same as removeFirst

        // 7. Iterate
        System.out.println("\nIterating:");
        for (String item : deque) {
            System.out.println(item);
        }

        // 8. Clear
        deque.clear();
        System.out.println("Deque after clear(): " + deque);
    }
}
