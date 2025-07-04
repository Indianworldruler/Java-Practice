public class StringMethodsExample {
    public static void main(String[] args) {
        String message = "Java is awesome";

        // 1. length()
        System.out.println("Length of string: " + message.length());

        // 2. charAt()
        System.out.println("Character at index 5: " + message.charAt(5));

        // 3. substring()
        System.out.println("Substring from index 5: " + message.substring(5));
        System.out.println("Substring from index 5 to 7: " + message.substring(5, 7));

        // 4. equals()
        String a = "Java";
        String b = "java";
        System.out.println("Is 'Java' equal to 'java'? " + a.equals(b));          // false (case-sensitive)
        System.out.println("Is 'Java' equal to 'java' (ignore case)? " + a.equalsIgnoreCase(b));  // true

        // 5. split()
        String sentence = "apple,banana,mango";
        String[] fruits = sentence.split(",");

        System.out.println("Split result:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}
