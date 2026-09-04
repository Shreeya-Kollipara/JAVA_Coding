import java.io.*;

public class Throws {
    static void readFile() throws IOException {
        FileReader reader=new FileReader("sample.txt");
        reader.close();
    }

    public static void main(String[] args) {
        try {
            readFile();
        } catch(IOException e) {
            System.out.println("File error");
        }
    }
}
