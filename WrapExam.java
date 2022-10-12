public class WrapExam {
    public static void main(String[] args) {
        int i = 365;
        double d = 36.5;
        Integer wint = 2022;
        Double wPi = 3.14159265358979;

        String id = Integer.toString(i) + Double.toString(d);

        System.out.println("int: " + i);
        System.out.println("double: " + d);
        System.out.println("id: " + id);
        System.out.println("Wrapper Int: " + wint.toString());
        System.out.println("Wrapper Double: " + wPi.toString());
    }
}
