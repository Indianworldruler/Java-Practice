import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample {
    public static void main(String[] args) {
        // 1. Create a HashSet
        HashSet<String> cities = new HashSet<>();

        // 2. Add elements
        cities.add("Delhi");
        cities.add("Mumbai");
        cities.add("Chennai");
        cities.add("Bangalore");
        cities.add("Delhi"); // duplicate, will be ignored
        cities.add(null);    // one null allowed

        // 3. Print the set
        System.out.println("Cities: " + cities); // Unordered

        // 4. Check for existence
        System.out.println("\nContains 'Mumbai'? " + cities.contains("Mumbai"));
        System.out.println("Contains 'Pune'? " + cities.contains("Pune"));

        // 5. Remove an element
        cities.remove("Chennai");
        System.out.println("After removing 'Chennai': " + cities);

        // 6. Size of the set
        System.out.println("Size: " + cities.size());

        // 7. Iterating using for-each loop
        System.out.println("\nLoop using for-each:");
        for (String city : cities) {
            System.out.println(city);
        }

        // 8. Iterating using iterator
        System.out.println("\nLoop using iterator:");
        Iterator<String> it = cities.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        // 9. isEmpty check
        System.out.println("\nIs set empty? " + cities.isEmpty());

        // 10. Clear the set
        cities.clear();
        System.out.println("After clear(): " + cities);
    }
}
