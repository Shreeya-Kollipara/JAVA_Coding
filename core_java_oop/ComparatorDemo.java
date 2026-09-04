import java.util.*;

public class ComparatorDemo {

    static class Student {
        String name;
        int marks;

        Student(String name,int marks) {
            this.name=name;
            this.marks=marks;
        }
    }

    public static void main(String[] args) {
        ArrayList<Student> students=new ArrayList<>();

        students.add(new Student("A",80));
        students.add(new Student("B",95));
        students.add(new Student("C",88));

        students.sort((a,b)->b.marks-a.marks);

        for(Student student:students)
            System.out.println(student.name+" "+student.marks);
    }
}
