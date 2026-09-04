public class ObjectMethods {
    String name;

    ObjectMethods(String name) {
        this.name=name;
    }

    @Override
    public String toString() {
        return "Name: "+name;
    }

    public static void main(String[] args) {
        ObjectMethods obj=new ObjectMethods("Java");

        System.out.println(obj);
    }
}
