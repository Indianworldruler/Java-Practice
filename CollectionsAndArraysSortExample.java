import java.util.*;

public class CollectionsAndArraysSortExample {
    public static void main(String[] args) {
        // === 1. Collections.sort() with Custom Logic ===
        List<String> names = new ArrayList<>(Arrays.asList("Riya", "Parth", "Aman", "Zoya", "Meena"));

        System.out.println("Original List: " + names);

        // Sort alphabetically (default)
        Collections.sort(names);
        System.out.println("Sorted Alphabetically: " + names);

        // Sort by length of name (custom logic)
        Collections.sort(names, (a, b) -> a.length() - b.length());
        System.out.println("Sorted by Name Length: " + names);

        // Sort in reverse order
        Collections.sort(names, Collections.reverseOrder());
        System.out.println("Sorted in Reverse Order: " + names);


        // === 2. Arrays.sort() with Custom Logic ===
        String[] fruits = {"Banana", "Apple", "Watermelon", "Mango", "Grapes"};

        System.out.println("\nOriginal Array: " + Arrays.toString(fruits));

        // Default alphabetical sort
        Arrays.sort(fruits);
        System.out.println("Alphabetically Sorted Array: " + Arrays.toString(fruits));

        // Custom sort: by last character of the string
        Arrays.sort(fruits, (a, b) -> {
            char lastA = a.charAt(a.length() - 1);
            char lastB = b.charAt(b.length() - 1);
            return Character.compare(lastA, lastB);
        });
        System.out.println("Sorted by Last Character: " + Arrays.toString(fruits));

        // Custom sort: by string length descending
        Arrays.sort(fruits, (a, b) -> b.length() - a.length());
        System.out.println("Sorted by Length Descending: " + Arrays.toString(fruits));
    }
}
