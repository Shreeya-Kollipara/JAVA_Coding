interface Printable {
    void print();
}

public class Interface implements Printable {
    public void print() {
        System.out.println("Printing");
    }

    public static void main(String[] args) {
        Printable obj=new Interface();
        obj.print();
    }
}
