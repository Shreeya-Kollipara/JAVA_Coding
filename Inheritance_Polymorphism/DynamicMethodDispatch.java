class Animal {
    void sound() {
        System.out.println("Animal");
    }
}

class Cat extends Animal {
    void sound() {
        System.out.println("Meow");
    }
}

public class DynamicMethodDispatch {
    public static void main(String[] args) {
        Animal animal=new Cat();

        animal.sound();
    }
}
