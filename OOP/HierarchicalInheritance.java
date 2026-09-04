class Vehicle {
    void start() {
        System.out.println("Vehicle started");
    }
}

class Car extends Vehicle {
    void drive() {
        System.out.println("Car driving");
    }
}

class Bike extends Vehicle {
    void ride() {
        System.out.println("Bike riding");
    }
}

public class HierarchicalInheritance {
    public static void main(String[] args) {
        Car car=new Car();
        Bike bike=new Bike();

        car.start();
        car.drive();

        bike.start();
        bike.ride();
    }
}
