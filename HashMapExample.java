import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;

public class HashMapExample {
    public static void main(String[] args) {
        // 1. Create a HashMap
        HashMap<String, Integer> marks = new HashMap<>();

        // 2. Put key-value pairs into the map
        marks.put("Parth", 90);
        marks.put("Riya", 85);
        marks.put("Aman", 92);
        marks.put("Neha", 78);
        marks.put("Riya", 88); // Overwrites previous value for "Riya"

        // 3. null keys and values
        marks.put(null, 50);         // one null key allowed
        marks.put("Dummy", null);    // null value allowed
        marks.put("Ghost", null);

        // 4. Print entire map
        System.out.println("Student Marks: " + marks);

        // 5. Access value by key
        System.out.println("\nParth's marks: " + marks.get("Parth"));
        System.out.println("Unknown's marks: " + marks.get("Unknown")); // null

        // 6. Check if key or value exists
        System.out.println("\nContains key 'Neha'? " + marks.containsKey("Neha"));
        System.out.println("Contains value 92? " + marks.containsValue(92));

        // 7. Remove by key
        marks.remove("Ghost");
        System.out.println("\nAfter removing 'Ghost': " + marks);

        // 8. Replace a value
        marks.replace("Aman", 95);
        System.out.println("After replacing Aman's marks: " + marks);

        // 9. Iterate using keySet
        System.out.println("\nIterating using keySet():");
        for (String name : marks.keySet()) {
            System.out.println(name + " => " + marks.get(name));
        }

        // 10. Iterate using entrySet
        System.out.println("\nIterating using entrySet():");
        for (Map.Entry<String, Integer> entry : marks.entrySet()) {
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }

        // 11. Get all keys and values
        Set<String> keys = marks.keySet();
        Collection<Integer> values = marks.values();

        System.out.println("\nAll keys: " + keys);
        System.out.println("All values: " + values);

        // 12. Size of map
        System.out.println("\nSize: " + marks.size());

        // 13. Clear the map
        marks.clear();
        System.out.println("After clear(): " + marks);
    }
}
