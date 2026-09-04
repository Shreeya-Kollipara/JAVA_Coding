public class Student {

    private String name;
    private int marks;

    Student(String name,int marks) {
        this.name=name;
        this.marks=marks;
    }

    void display() {
        System.out.println(name+" "+marks);
    }

    public static void main(String[] args) {
        Student student=new Student("Student",90);
        student.display();
    }
}
