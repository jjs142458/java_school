public class IntegerExam {
    public static void main(String[] args) {
        int i = 100;
        Integer i1 = i;                     // Auto Boxing
        Integer i2 = Integer.valueOf(i);    // Boxing
        // Integer i3 = new Integer(100);   // 예전에 쓰던 방식, 지금은 사용하지 않습니다

        System.out.println(i1.equals(i2));
    }
}
