import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        // 1. Create a Stack
        Stack<String> books = new Stack<>();

        // 2. Push elements (add to top)
        books.push("Math");
        books.push("Science");
        books.push("History");
        books.push("English");

        System.out.println("Stack: " + books); // Top = last element

        // 3. Peek (view top without removing)
        System.out.println("Top element (peek): " + books.peek());

        // 4. Pop (remove top)
        System.out.println("Popped: " + books.pop());
        System.out.println("After pop: " + books);

        // 5. Search (1-based from top)
        System.out.println("Position of 'Math': " + books.search("Math")); // returns 2

        // 6. Is stack empty?
        System.out.println("Is empty? " + books.empty());

        // 7. Pop all elements
        while (!books.isEmpty()) {
            System.out.println("Removing: " + books.pop());
        }

        System.out.println("Stack after clearing: " + books);
    }
}
