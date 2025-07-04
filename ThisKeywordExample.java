public class ThisKeywordExample {
    String name;
    int age;

    // Constructor with parameter names same as instance variables
    ThisKeywordExample(String name, int age) {
        // 'this' helps distinguish between instance variables and parameters
        this.name = name;
        this.age = age;
    }

    // Method to display info using 'this'
    void showInfo() {
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
        
        // Calling another method using 'this'
        this.sayHello();
    }

    // Another method in the same class
    void sayHello() {
        System.out.println("Hello, " + name + "!");
    }

    // Bonus: Constructor chaining using 'this()'
    ThisKeywordExample() {
        this("Default Name", 0); // Calls the parameterized constructor
    }

    public static void main(String[] args) {
        // Object 1: uses parameterized constructor
        ThisKeywordExample person1 = new ThisKeywordExample("Parth", 22);
        person1.showInfo();

        System.out.println();

        // Object 2: uses default constructor that chains to parameterized one
        ThisKeywordExample person2 = new ThisKeywordExample();
        person2.showInfo();
    }
}
