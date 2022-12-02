package IO;

import java.io.*;

public class FilterIOExam {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("data.dat");
        BufferedOutputStream bos = new BufferedOutputStream(fos);
        DataOutputStream dos = new DataOutputStream(bos);

        dos.writeInt(740);
        dos.writeDouble(3.141592);

        bos.flush();

        FileInputStream fis = new FileInputStream("data.dat");
        DataInputStream dis = new DataInputStream(fis);
        int data = dis.readInt();
        double p = dis.readDouble();




        System.out.println(data);
        System.out.println(p);
    }
}
