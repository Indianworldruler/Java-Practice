import java.util.*;

// Custom class
class Student {
    String name;
    int age;
    double marks;

    public Student(String name, int age, double marks) {
        this.name = name;
        this.age = age;
        this.marks = marks;
    }

    public String toString() {
        return name + " (Age: " + age + ", Marks: " + marks + ")";
    }
}

public class CustomObjectSortingExample {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Parth", 21, 89.5));
        students.add(new Student("Riya", 19, 91.0));
        students.add(new Student("Aman", 22, 75.4));
        students.add(new Student("Meena", 20, 89.5));

        System.out.println("=== Original List ===");
        students.forEach(System.out::println);

        // 1. Sort by name (Alphabetically)
        students.sort(Comparator.comparing(s -> s.name));
        System.out.println("\n=== Sorted by Name ===");
        students.forEach(System.out::println);

        // 2. Sort by age (Ascending)
        students.sort(Comparator.comparingInt(s -> s.age));
        System.out.println("\n=== Sorted by Age (Ascending) ===");
        students.forEach(System.out::println);

        // 3. Sort by marks (Descending)
        students.sort((a, b) -> Double.compare(b.marks, a.marks));
        System.out.println("\n=== Sorted by Marks (Descending) ===");
        students.forEach(System.out::println);

        // 4. Sort by marks DESC then name ASC (Tie-breaker)
        students.sort(Comparator.comparingDouble(Student::getMarks)
                                .reversed()
                                .thenComparing(s -> s.name));
        System.out.println("\n=== Sorted by Marks DESC, then Name ASC ===");
        students.forEach(System.out::println);
    }
}

// Add getter if needed for comparator chaining
class StudentWithGetter extends Student {
    public StudentWithGetter(String name, int age, double marks) {
        super(name, age, marks);
    }

    public double getMarks() {
        return this.marks;
    }
}
