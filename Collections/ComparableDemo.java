import java.util.*;

class Student implements Comparable<Student> {
    String name;
    int marks;

    Student(String name,int marks) {
        this.name=name;
        this.marks=marks;
    }

    public int compareTo(Student other) {
        return this.marks-other.marks;
    }
}

public class ComparableDemo {
    public static void main(String[] args) {
        ArrayList<Student> students=new ArrayList<>();

        students.add(new Student("A",80));
        students.add(new Student("B",70));
        students.add(new Student("C",90));

        Collections.sort(students);

        for(Student s:students)
            System.out.println(s.name+" "+s.marks);
    }
}
