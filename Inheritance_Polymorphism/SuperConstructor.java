class Parent {
    Parent() {
        System.out.println("Parent constructor");
    }
}

public class SuperConstructor extends Parent {
    SuperConstructor() {
        super();
        System.out.println("Child constructor");
    }

    public static void main(String[] args) {
        new SuperConstructor();
    }
}
