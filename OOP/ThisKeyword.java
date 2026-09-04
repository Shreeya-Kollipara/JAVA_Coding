public class ThisKeyword {
    int value;

    ThisKeyword(int value) {
        this.value=value;
    }

    void show() {
        System.out.println(this.value);
    }

    public static void main(String[] args) {
        ThisKeyword obj=new ThisKeyword(50);
        obj.show();
    }
}
