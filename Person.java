public class Person {
    String name;
    int age;

    // 1. Default constructor (no parameters)
    Person() {
        name = "Unknown";
        age = 0;
        System.out.println("Default constructor called!");
    }

    // 2. Parameterized constructor
    Person(String n, int a) {
        name = n;
        age = a;
        System.out.println("Parameterized constructor called!");
    }

    // Method to display person details
    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        // Using default constructor
        Person p1 = new Person();  // constructor runs automatically
        p1.display();

        System.out.println();

        // Using parameterized constructor
        Person p2 = new Person("Parth", 22);
        p2.display();
    }
}
