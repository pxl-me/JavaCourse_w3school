package Inheritance;

public class Car extends Vehicle {
    final private String modelName = "Mustang";    // Inheritance.Car attribute

    public static void main(String[] args) {

        // Create a myCar object
        Car myCar = new Car();

        // Call the honk() method (from the Inheritance.Vehicle class) on the myCar object
        myCar.honk();

        // Display the value of the brand attribute (from the Inheritance.Vehicle class)
        // and the value of the modelName from the Inheritance.Car class
        System.out.println(myCar.brand + " " + myCar.modelName);
    }
}
