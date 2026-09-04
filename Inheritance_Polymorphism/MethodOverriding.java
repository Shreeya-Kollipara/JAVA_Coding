class Parent {
    void show() {
        System.out.println("Parent");
    }
}

public class MethodOverriding extends Parent {
    @Override
    void show() {
        System.out.println("Child");
    }

    public static void main(String[] args) {
        Parent obj=new MethodOverriding();

        obj.show();
    }
}
