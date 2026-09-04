public class Constructor {
    String name;

    Constructor(String name) {
        this.name=name;
    }

    public static void main(String[] args) {
        Constructor obj=new Constructor("Java");

        System.out.println(obj.name);
    }
}
