public class StaticExample {

    // Static variable (shared by all objects)
    static int objectCount = 0;

    // Instance variable (unique for each object)
    String name;

    // Constructor
    StaticExample(String n) {
        name = n;
        objectCount++;  // Increase shared counter when object is created
    }

    // Instance method
    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Total objects so far: " + objectCount);
    }

    // Static method (can access only static variables)
    static void showObjectCount() {
        System.out.println("Total objects created (from static method): " + objectCount);
        
        // ❌ ERROR if you try to use `name` here — it’s not static
        // System.out.println(name); // Not allowed in static context
    }

    public static void main(String[] args) {
        // Calling static method without any object
        StaticExample.showObjectCount();  // Prints 0 initially

        // Creating objects
        StaticExample obj1 = new StaticExample("Parth");
        StaticExample obj2 = new StaticExample("Riya");

        // Using instance methods
        obj1.displayInfo();
        System.out.println();
        obj2.displayInfo();

        System.out.println();

        // Calling static method again after creating objects
        StaticExample.showObjectCount();
    }
}
