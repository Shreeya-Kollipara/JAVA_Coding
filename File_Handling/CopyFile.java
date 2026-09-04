import java.io.*;

public class CopyFile {
    public static void main(String[] args) {
        try {
            FileInputStream input=new FileInputStream("source.txt");
            FileOutputStream output=new FileOutputStream("copy.txt");

            int data;

            while((data=input.read())!=-1)
                output.write(data);

            input.close();
            output.close();

            System.out.println("File copied");
        } catch(IOException e) {
            System.out.println("Copy failed");
        }
    }
}
