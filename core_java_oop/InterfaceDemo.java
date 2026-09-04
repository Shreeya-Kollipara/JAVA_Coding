interface Shape {

    double area();
}

class Circle implements Shape {

    double radius;

    Circle(double radius) {
        this.radius=radius;
    }

    public double area() {
        return Math.PI*radius*radius;
    }
}

public class InterfaceDemo {

    public static void main(String[] args) {
        Circle circle=new Circle(3);

        System.out.println(circle.area());
    }
}
