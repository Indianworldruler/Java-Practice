public class StringBuilderExample {
    public static void main(String[] args) {

        // 1. Create a StringBuilder
        StringBuilder sb = new StringBuilder("Java");

        // 2. Append
        sb.append(" Programming");
        System.out.println("After append: " + sb);

        // 3. Insert at specific index
        sb.insert(5, "is Fun ");
        System.out.println("After insert: " + sb);

        // 4. Replace a part of the string
        sb.replace(5, 12, "is Powerful ");
        System.out.println("After replace: " + sb);

        // 5. Delete part of the string
        sb.delete(5, 16); // deleting "is Powerful"
        System.out.println("After delete: " + sb);

        // 6. Reverse the string
        sb.reverse();
        System.out.println("After reverse: " + sb);

        // 7. Convert back to String
        String result = sb.toString();
        System.out.println("Converted to String: " + result);

        // 8. Performance hint (not full benchmark)
        System.out.println("\nStringBuilder is preferred when doing many changes in a loop:");
        String slowString = "";
        StringBuilder fastString = new StringBuilder();

        // With String (inefficient)
        long start1 = System.nanoTime();
        for (int i = 0; i < 1000; i++) {
            slowString += i;  // creates new String every time
        }
        long end1 = System.nanoTime();

        // With StringBuilder (efficient)
        long start2 = System.nanoTime();
        for (int i = 0; i < 1000; i++) {
            fastString.append(i);
        }
        long end2 = System.nanoTime();

        System.out.println("Time with String:      " + (end1 - start1) + " ns");
        System.out.println("Time with StringBuilder: " + (end2 - start2) + " ns");
    }
}
