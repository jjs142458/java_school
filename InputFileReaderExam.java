import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

public class InputFileReaderExam {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("in.txt");
            Reader reader = new InputStreamReader(fis);

            while(true) {
                int i = reader.read();
                if (i == -1) break;
                char c = (char) i;
                System.out.print(c);
            }
            reader.close();
            fis.close();
        } catch (IOException e) {
            System.out.println(e);
        }
        System.out.println();
    }
}
