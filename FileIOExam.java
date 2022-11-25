import java.io.*;

public class FileIOExam {
    public static void main(String[] args) throws IOException {

        OutputStream fos = new FileOutputStream("data.dat");
        fos.write(97);
        fos.close();

        InputStream fis = new FileInputStream("data.dat");
        int data = fis.read();

        System.out.println(data);
    }
}

