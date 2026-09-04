public class PassByValue {
    static void change(int x) {
        x=100;
    }

    public static void main(String[] args) {
        int x=10;

        change(x);

        System.out.println(x);
    }
}
