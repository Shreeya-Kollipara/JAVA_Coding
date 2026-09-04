class Vehicle {
    void start() {
        System.out.println("Vehicle");
    }
}

class Car extends Vehicle {
    void drive() {
        System.out.println("Car");
    }
}

public class Upcasting {
    public static void main(String[] args) {
        Vehicle vehicle=new Car();

        vehicle.start();
    }
}
