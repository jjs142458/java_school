package IO;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FlleExam {
    public static void main(String[] args) throws IOException {
        try {
            FileReader fr = new FileReader("datar.txt");
            FileWriter fw = new FileWriter("datar.txt");
            int c;
            while ((c = fr.read())!= -1) {
                fw.write(c);
            }
        } catch (Exception e) {
            System.out.println(e.toString());
            System.out.println(e.getMessage());
            e.printStackTrace();
        }

        System.out.println("dsa");
    }
}
