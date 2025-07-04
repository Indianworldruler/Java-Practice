public class MethodOverloadingExample {

    // Method with no parameters
    public static void display() {
        System.out.println("Display method with no parameters");
    }

    // Overloaded method with one int parameter
    public static void display(int number) {
        System.out.println("Display method with one int: " + number);
    }

    // Overloaded method with two parameters
    public static void display(String text, int count) {
        System.out.println("Display method with a String and an int:");
        for (int i = 0; i < count; i++) {
            System.out.println(text);
        }
    }

    public static void main(String[] args) {
        // Calling different versions of display()
        display();
        display(100);
        display("Hello, Java!", 3);
    }
}
