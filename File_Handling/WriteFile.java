import java.io.*;

public class WriteFile {
    public static void main(String[] args) {
        try {
            FileWriter writer=new FileWriter("sample.txt");

            writer.write("Java file handling");
            writer.close();

            System.out.println("Data written");
        } catch(IOException e) {
            System.out.println("Unable to write file");
        }
    }
}
