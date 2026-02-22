 package OOPS.inheritance;

// ----------- Interface (for multiple inheritance) -----------
interface Engine {

    String engineType = "Electric"; // constant by default

    void start();   // abstract method
    void stop();
}


// ----------- Base Class -----------
class Vehicle {

    public String brand;

    public Vehicle(String brand) {
        this.brand = brand;
    }

    public void displayBrand() {
        System.out.println("Vehicle Brand: " + brand);
    }
}


// ----------- Child Class (Multilevel step 1) -----------
class Car extends Vehicle implements Engine {

    protected String model;

    public Car(String brand, String model) {
        super(brand);
        this.model = model;
    }

    public void drive() {
        System.out.println("Driving the car " + brand + " " + model);
    }

    public void park() {
        System.out.println("Parking the car " + brand + " " + model);
    }

    // Implementing Engine interface methods
    public void start() {
        System.out.println("Starting the " + engineType + " engine");
    }

    public void stop() {
        System.out.println("Stopping the " + engineType + " engine");
    }
}


// ----------- Child Class (Multilevel step 2) -----------
class ElectricCar extends Car {

    protected int batteryCapacity;

    public ElectricCar(String brand, String model, int batteryCapacity) {
        super(brand, model);
        this.batteryCapacity = batteryCapacity;
    }

    public void charge() {
        System.out.println(
            "Charging Electric Car: " + brand +
            " " + model +
            " | Battery: " + batteryCapacity + " kWh"
        );
    }
}


// ----------- Main Class -----------
public class Hybrid_Inheritance {

    public static void main(String[] args) {

        ElectricCar c = new ElectricCar("Tesla", "Model S", 75);

        c.displayBrand(); // from Vehicle
        c.drive();        // from Car
        c.start();        // from Engine (interface)
        c.charge();       // from ElectricCar
        c.stop();         // from Engine
    }
}
