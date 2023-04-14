package Exception;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FOutException {
    public static void main(String[] args) throws IOException {
    FileWriter fw = null;
    FileReader fr = new FileReader("output.txt");
    try {
        fw = new FileWriter( "output.txt");
        fw.write("Test Text");
        fw.close();
        while (true) {
            int i = fr.read();
            if (i == -1) break;
            char c = (char) i;
            System.out.print(c);
        }
        System.out.println();
        fr.close();
        }
    catch (IOException e) {
        System.err.println("IOException이 발생하였습니다. ");
        e.printStackTrace ();
        }
    finally {
        System.out.println("예외 여부와 관계 없이 무조건 실행되는 finally 구문");
        }
    System.out. println("FOutExcept. java 실행 완료 ! ");
    }
}
