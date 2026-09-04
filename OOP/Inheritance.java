class Animal {
    void eat() {
        System.out.println("Eating");
    }
}

public class Inheritance extends Animal {
    void walk() {
        System.out.println("Walking");
    }

    public static void main(String[] args) {
        Inheritance dog=new Inheritance();

        dog.eat();
        dog.walk();
    }
}
