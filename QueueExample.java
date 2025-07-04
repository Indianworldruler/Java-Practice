import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        // 1. Create a Queue
        Queue<String> queue = new LinkedList<>();

        // 2. Add elements
        queue.offer("Customer1");
        queue.offer("Customer2");
        queue.offer("Customer3");

        System.out.println("Queue: " + queue); // First element is front

        // 3. Peek (front)
        System.out.println("Front (peek): " + queue.peek());

        // 4. Poll (remove front)
        System.out.println("Served: " + queue.poll());
        System.out.println("Queue after poll: " + queue);

        // 5. Contains and size
        System.out.println("Contains 'Customer2'? " + queue.contains("Customer2"));
        System.out.println("Size: " + queue.size());

        // 6. Iterating through queue
        System.out.println("\nLooping:");
        for (String customer : queue) {
            System.out.println(customer);
        }

        // 7. Clear
        queue.clear();
        System.out.println("After clear(): " + queue);
    }
}
