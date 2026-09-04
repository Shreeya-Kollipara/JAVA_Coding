class Parent {
    final void show() {
        System.out.println("Cannot override this method");
    }
}

public class FinalKeyword extends Parent {
    public static void main(String[] args) {
        final int x=10;

        System.out.println(x);
        new FinalKeyword().show();
    }
}
