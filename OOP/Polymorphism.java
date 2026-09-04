class Animal {
    void sound() {
        System.out.println("Animal sound");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Bark");
    }
}

public class Polymorphism {
    public static void main(String[] args) {
        Animal animal=new Dog();

        animal.sound();
    }
}
