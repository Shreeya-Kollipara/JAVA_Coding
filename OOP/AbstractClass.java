abstract class Shape {
    abstract void draw();

    void message() {
        System.out.println("Shape");
    }
}

public class AbstractClass extends Shape {
    void draw() {
        System.out.println("Drawing circle");
    }

    public static void main(String[] args) {
        AbstractClass obj=new AbstractClass();

        obj.draw();
        obj.message();
    }
}
