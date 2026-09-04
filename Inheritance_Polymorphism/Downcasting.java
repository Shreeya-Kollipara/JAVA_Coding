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

public class Downcasting {
    public static void main(String[] args) {
        Vehicle vehicle=new Car();

        Car car=(Car)vehicle;
        car.drive();
    }
}
