// This file shows how to define a class and create an object

// Define a class named 'Car'
public class Car {
    // Fields (variables)
    String brand;
    String color;
    int speed;

    // Method to display details of the car
    void displayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Color: " + color);
        System.out.println("Speed: " + speed + " km/h");
    }

    // Main method to create and use Car objects
    public static void main(String[] args) {
        // Create object of Car
        Car myCar = new Car();

        // Assign values
        myCar.brand = "Toyota";
        myCar.color = "Red";
        myCar.speed = 120;

        // Call method
        myCar.displayInfo();

        // Create another car
        Car anotherCar = new Car();
        anotherCar.brand = "Honda";
        anotherCar.color = "Blue";
        anotherCar.speed = 100;
        System.out.println("\nSecond car:");
        anotherCar.displayInfo();
    }
}
