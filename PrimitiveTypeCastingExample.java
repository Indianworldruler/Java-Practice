public class PrimitiveTypeCastingExample {
    public static void main(String[] args) {
        System.out.println("=== Widening Casting (Automatic) ===");

        byte byteVal = 10;
        short shortVal = byteVal;     // byte → short
        int intVal = shortVal;        // short → int
        long longVal = intVal;        // int → long
        float floatVal = longVal;     // long → float
        double doubleVal = floatVal;  // float → double

        System.out.println("byte: " + byteVal);
        System.out.println("short: " + shortVal);
        System.out.println("int: " + intVal);
        System.out.println("long: " + longVal);
        System.out.println("float: " + floatVal);
        System.out.println("double: " + doubleVal);

        System.out.println("\n=== Narrowing Casting (Manual) ===");

        double d = 123.987;
        float f = (float) d;      // double → float
        long l = (long) f;        // float → long
        int i = (int) l;          // long → int
        short s = (short) i;      // int → short
        byte b = (byte) s;        // short → byte (risk of overflow)

        System.out.println("Original double: " + d);
        System.out.println("Casted float: " + f);
        System.out.println("Casted long: " + l);
        System.out.println("Casted int: " + i);
        System.out.println("Casted short: " + s);
        System.out.println("Casted byte: " + b);

        System.out.println("\n=== Overflow Example ===");

        int overflowInt = 130;
        byte overflowByte = (byte) overflowInt;  // Overflow: byte max is 127
        System.out.println("Original int: " + overflowInt);
        System.out.println("Overflowed byte: " + overflowByte); // Outputs -126

        System.out.println("\n=== Summary Done ===");
    }
}
