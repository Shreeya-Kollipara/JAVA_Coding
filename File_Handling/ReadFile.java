import java.io.*;

public class ReadFile {
    public static void main(String[] args) {
        try {
            FileReader reader=new FileReader("sample.txt");
            int ch;

            while((ch=reader.read())!=-1)
                System.out.print((char)ch);

            reader.close();
        } catch(IOException e) {
            System.out.println("Unable to read file");
        }
    }
}
