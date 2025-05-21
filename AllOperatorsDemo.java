public class AllOperatorsDemo {
    public static void main(String[] args) {
        int a = 10, b = 5;

        // Arithmetic Operators
        System.out.println("== Arithmetic Operators ==");
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));
        System.out.println("a % b = " + (a % b));

        // Relational Operators
        System.out.println("\n== Relational Operators ==");
        System.out.println("a == b: " + (a == b));
        System.out.println("a != b: " + (a != b));
        System.out.println("a > b: " + (a > b));
        System.out.println("a < b: " + (a < b));
        System.out.println("a >= b: " + (a >= b));
        System.out.println("a <= b: " + (a <= b));

        // Logical Operators
        boolean x = true, y = false;
        System.out.println("\n== Logical Operators ==");
        System.out.println("x && y: " + (x && y));
        System.out.println("x || y: " + (x || y));
        System.out.println("!x: " + (!x));

        // Bitwise Operators
        int m = 6;  // 110
        int n = 4;  // 100
        System.out.println("\n== Bitwise Operators ==");
        System.out.println("m & n: " + (m & n));   // 100 => 4
        System.out.println("m | n: " + (m | n));   // 110 => 6
        System.out.println("m ^ n: " + (m ^ n));   // 010 => 2
        System.out.println("~m: " + (~m));         // invert bits
        System.out.println("m << 1: " + (m << 1)); // shift left => 12
        System.out.println("m >> 1: " + (m >> 1)); // shift right => 3

        // Assignment Operators
        System.out.println("\n== Assignment Operators ==");
        int assign = 10;
        assign += 5;
        System.out.println("assign += 5: " + assign);
        assign -= 2;
        System.out.println("assign -= 2: " + assign);
        assign *= 2;
        System.out.println("assign *= 2: " + assign);
        assign /= 4;
        System.out.println("assign /= 4: " + assign);
        assign %= 3;
        System.out.println("assign %= 3: " + assign);

        // Unary Operators
        System.out.println("\n== Unary Operators ==");
        int num = 10;
        System.out.println("num++: " + (num++)); // prints 10, then num becomes 11
        System.out.println("++num: " + (++num)); // now prints 12
        System.out.println("num--: " + (num--)); // prints 12, then num becomes 11
        System.out.println("--num: " + (--num)); // now prints 10

        // Ternary Operator
        System.out.println("\n== Ternary Operator ==");
        int max = (a > b) ? a : b;
        System.out.println("Max of a and b is: " + max);
    }
}
