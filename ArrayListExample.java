import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        // 1. Create an ArrayList of Strings
        ArrayList<String> fruits = new ArrayList<>();

        // 2. Add elements
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");
        fruits.add("Banana");  // duplicates allowed

        // 3. Print the list
        System.out.println("Fruits List: " + fruits);

        // 4. Access elements by index
        System.out.println("First fruit: " + fruits.get(0));

        // 5. Modify an element
        fruits.set(2, "Orange");
        System.out.println("After replacing index 2: " + fruits);

        // 6. Remove by index or value
        fruits.remove(1); // removes "Banana" at index 1
        fruits.remove("Apple"); // removes "Apple" by value
        System.out.println("After removals: " + fruits);

        // 7. Size of list
        System.out.println("Size: " + fruits.size());

        // 8. Search for element
        System.out.println("Contains 'Mango'? " + fruits.contains("Mango"));

        // 9. Loop through list
        System.out.println("\nLoop using for-each:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // 10. Clear the list
        fruits.clear();
        System.out.println("\nAfter clear(): " + fruits);
    }
}
