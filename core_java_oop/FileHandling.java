import java.io.*;

public class FileHandling {

    public static void main(String[] args) throws Exception {

        FileWriter writer=new FileWriter("sample.txt");
        writer.write("Java practice");
        writer.close();

        BufferedReader reader=new BufferedReader(new FileReader("sample.txt"));

        System.out.println(reader.readLine());

        reader.close();
    }
}
