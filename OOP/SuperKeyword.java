class Parent {
    int value=10;
}

public class SuperKeyword extends Parent {
    int value=20;

    void show() {
        System.out.println(value);
        System.out.println(super.value);
    }

    public static void main(String[] args) {
        new SuperKeyword().show();
    }
}
