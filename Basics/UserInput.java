import java.util.*;

public class UserInput {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter name: ");
        String name=sc.nextLine();

        System.out.print("Enter age: ");
        int age=sc.nextInt();

        System.out.println(name+" is "+age+" years old.");
    }
}
