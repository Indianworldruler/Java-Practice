import java.util.*;

public class CollectionIterationExample {
    public static void main(String[] args) {

        // --- 1. ArrayList Example ---
        System.out.println("=== ArrayList Iteration ===");
        ArrayList<String> names = new ArrayList<>();
        names.add("Parth");
        names.add("Riya");
        names.add("Aman");

        // a. For-each loop
        System.out.println("For-each loop:");
        for (String name : names) {
            System.out.println(name);
        }

        // b. Iterator
        System.out.println("Iterator:");
        Iterator<String> nameIterator = names.iterator();
        while (nameIterator.hasNext()) {
            System.out.println(nameIterator.next());
        }

        // c. forEach() with lambda
        System.out.println("forEach + lambda:");
        names.forEach(n -> System.out.println(n));

        System.out.println();


        // --- 2. HashSet Example ---
        System.out.println("=== HashSet Iteration ===");
        HashSet<String> fruits = new HashSet<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");

        // a. For-each
        System.out.println("For-each loop:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // b. Iterator
        System.out.println("Iterator:");
        Iterator<String> fruitIterator = fruits.iterator();
        while (fruitIterator.hasNext()) {
            System.out.println(fruitIterator.next());
        }

        // c. Lambda
        System.out.println("forEach + lambda:");
        fruits.forEach(f -> System.out.println(f));

        System.out.println();


        // --- 3. HashMap Example ---
        System.out.println("=== HashMap Iteration ===");
        HashMap<String, Integer> ages = new HashMap<>();
        ages.put("Parth", 22);
        ages.put("Riya", 21);
        ages.put("Aman", 23);

        // a. For-each loop using entrySet
        System.out.println("Using entrySet:");
        for (Map.Entry<String, Integer> entry : ages.entrySet()) {
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }

        // b. Iterator over entrySet
        System.out.println("Iterator over entrySet:");
        Iterator<Map.Entry<String, Integer>> ageIterator = ages.entrySet().iterator();
        while (ageIterator.hasNext()) {
            Map.Entry<String, Integer> entry = ageIterator.next();
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }

        // c. KeySet and for-each
        System.out.println("Using keySet + get():");
        for (String key : ages.keySet()) {
            System.out.println(key + " => " + ages.get(key));
        }

        // d. Lambda
        System.out.println("forEach + lambda:");
        ages.forEach((key, value) -> System.out.println(key + " => " + value));
    }
}
