import java.util.ArrayList;

public class AutoboxingExample {
    public static void main(String[] args) {
        // Primitive int
        int num = 42;

        // Autoboxing: converting int to Integer object automatically
        Integer boxedNum = num;

        // You can even store primitives in collections (which store objects)
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);     // autoboxes to Integer.valueOf(10)
        list.add(num);    // autoboxes num to Integer
        list.add(25);     // autoboxes again

        System.out.println("Boxed Integer: " + boxedNum);
        System.out.println("ArrayList contents: " + list);
    }
}
