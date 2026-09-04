import java.io.*;

public class AppendFile {
    public static void main(String[] args) {
        try {
            FileWriter writer=new FileWriter("sample.txt",true);

            writer.write("\nNew data added");
            writer.close();

            System.out.println("Data appended");
        } catch(IOException e) {
            System.out.println("Error");
        }
    }
}
