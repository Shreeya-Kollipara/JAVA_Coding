class Animal {
    void eat() {
        System.out.println("Eating");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Barking");
    }
}

public class MultilevelInheritance extends Dog {
    void run() {
        System.out.println("Running");
    }

    public static void main(String[] args) {
        MultilevelInheritance obj=new MultilevelInheritance();

        obj.eat();
        obj.bark();
        obj.run();
    }
}
