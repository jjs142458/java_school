package Method;

public class ToStringExam {
    public static void main(String[] args) {
        StringBuffer sb1 = new StringBuffer("TestThis");
        String str = null;
        str = sb1.toString();
        System.out.println(str.toUpperCase());
        System.out.println(str.toLowerCase());
    }
}
