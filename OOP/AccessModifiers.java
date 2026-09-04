class AccessExample {
    private int privateValue=1;
    int defaultValue=2;
    protected int protectedValue=3;
    public int publicValue=4;

    void show() {
        System.out.println(privateValue);
        System.out.println(defaultValue);
        System.out.println(protectedValue);
        System.out.println(publicValue);
    }
}

public class AccessModifiers {
    public static void main(String[] args) {
        new AccessExample().show();
    }
}
