public class ClassObject {
    String name;
    int age;

    void display() {
        System.out.println(name+" "+age);
    }

    public static void main(String[] args) {
        ClassObject student=new ClassObject();

        student.name="Riya";
        student.age=21;

        student.display();
    }
}
