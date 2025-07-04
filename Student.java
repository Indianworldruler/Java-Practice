// This file shows class methods used with objects

public class Student {
    // Fields
    String name;
    int age;
    double grade;

    // Method to set data
    void setDetails(String n, int a, double g) {
        name = n;
        age = a;
        grade = g;
    }

    // Method to display data
    void showDetails() {
        System.out.println("Name  : " + name);
        System.out.println("Age   : " + age);
        System.out.println("Grade : " + grade);
    }

    // Main method
    public static void main(String[] args) {
        // Create object
        Student s1 = new Student();
        s1.setDetails("Parth", 20, 88.5);
        s1.showDetails();

        System.out.println();

        Student s2 = new Student();
        s2.setDetails("Riya", 21, 91.2);
        s2.showDetails();
    }
}
