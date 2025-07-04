import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample {
    public static void main(String[] args) {
        // 1. Create a TreeMap
        TreeMap<String, Integer> scores = new TreeMap<>();

        // 2. Put entries
        scores.put("Ravi", 80);
        scores.put("Aman", 92);
        scores.put("Neha", 75);
        scores.put("Divya", 85);
        scores.put("Karan", 60);

        // 3. Values can be null, but not keys
        scores.put("Zara", null);
        // scores.put(null, 50); // ❌ This will throw NullPointerException

        // 4. Print map (automatically sorted by keys)
        System.out.println("Student Scores (Sorted by Name):");
        System.out.println(scores);

        // 5. Access by key
        System.out.println("\nScore of Aman: " + scores.get("Aman"));

        // 6. First and last keys
        System.out.println("\nFirst key: " + scores.firstKey());
        System.out.println("Last key: " + scores.lastKey());

        // 7. Higher and lower keys (navigation)
        System.out.println("Key higher than 'Aman': " + scores.higherKey("Aman"));
        System.out.println("Key lower than 'Neha': " + scores.lowerKey("Neha"));

        // 8. SubMap (range of keys)
        System.out.println("\nSubMap from 'Divya' to 'Ravi':");
        Map<String, Integer> subMap = scores.subMap("Divya", "Ravi");
        System.out.println(subMap);

        // 9. Iterate using entrySet
        System.out.println("\nIterating in sorted order:");
        for (Map.Entry<String, Integer> entry : scores.entrySet()) {
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }

        // 10. Removing entries
        scores.remove("Zara");
        scores.replace("Karan", 70);

        // 11. Descending order
        System.out.println("\nDescending map:");
        System.out.println(scores.descendingMap());

        // 12. Size and clear
        System.out.println("\nSize: " + scores.size());
        scores.clear();
        System.out.println("After clear(): " + scores);
    }
}
