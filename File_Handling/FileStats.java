import java.io.*;

public class FileStats {
    public static void main(String[] args) {
        int lines=0;
        int words=0;

        try {
            BufferedReader reader=new BufferedReader(new FileReader("sample.txt"));
            String line;

            while((line=reader.readLine())!=null) {
                lines++;

                if(!line.trim().isEmpty())
                    words+=line.trim().split("\\s+").length;
            }

            reader.close();

            System.out.println("Lines: "+lines);
            System.out.println("Words: "+words);
        } catch(IOException e) {
            System.out.println("Unable to read file");
        }
    }
}
