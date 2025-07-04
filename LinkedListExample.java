import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        // 1. Create a LinkedList of Integers
        LinkedList<Integer> numbers = new LinkedList<>();

        // 2. Add elements
        numbers.add(10);            // add to end
        numbers.add(20);
        numbers.add(30);
        numbers.addFirst(5);        // add to front
        numbers.addLast(40);        // add to end

        // 3. Print list
        System.out.println("Numbers: " + numbers);

        // 4. Access elements
        System.out.println("First element: " + numbers.getFirst());
        System.out.println("Last element: " + numbers.getLast());
        System.out.println("Element at index 2: " + numbers.get(2));

        // 5. Modify element
        numbers.set(2, 25);
        System.out.println("After modification: " + numbers);

        // 6. Remove elements
        numbers.removeFirst();  // remove from start
        numbers.removeLast();   // remove from end
        numbers.remove((Integer) 25); // remove specific value
        System.out.println("After removals: " + numbers);

        // 7. Size and contains
        System.out.println("Size: " + numbers.size());
        System.out.println("Contains 20? " + numbers.contains(20));

        // 8. Loop through list
        System.out.println("\nLoop using for-each:");
        for (int num : numbers) {
            System.out.println(num);
        }

        // 9. Clear list
        numbers.clear();
        System.out.println("\nAfter clear(): " + numbers);
    }
}
