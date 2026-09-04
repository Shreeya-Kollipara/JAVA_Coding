import java.util.*;

class Employee {
    String name;
    int salary;

    Employee(String name,int salary) {
        this.name=name;
        this.salary=salary;
    }
}

public class ComparatorDemo {
    public static void main(String[] args) {
        ArrayList<Employee> employees=new ArrayList<>();

        employees.add(new Employee("A",50000));
        employees.add(new Employee("B",70000));
        employees.add(new Employee("C",60000));

        employees.sort((a,b)->b.salary-a.salary);

        for(Employee e:employees)
            System.out.println(e.name+" "+e.salary);
    }
}
