package Method.Wrapper;

public class ValueOfExam {
    public static void main(String[] args) {
        char ch = 'A';
        String str = "ABVEFDAFD";
        int i = 10;
        char arr[] = new char[] {'a','b'};

        String export = String.valueOf(ch);
        String export1 = String.valueOf(str);
        String export2 = String.valueOf(i);
        String export3 = String.valueOf(arr);

        System.out.println(export);
        System.out.println(str);
        System.out.println(i);
        System.out.println(arr);

        System.out.println(String.valueOf(ch) + String.valueOf(i));
    }
}
