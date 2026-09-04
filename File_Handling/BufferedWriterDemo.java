import java.io.*;

public class BufferedWriterDemo {
    public static void main(String[] args) {
        try {
            BufferedWriter writer=new BufferedWriter(new FileWriter("sample.txt"));

            writer.write("First line");
            writer.newLine();
            writer.write("Second line");

            writer.close();
        } catch(IOException e) {
            System.out.println("Error writing file");
        }
    }
}
