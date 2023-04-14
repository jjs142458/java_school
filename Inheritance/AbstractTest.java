public class AbstractTest {
    public static void main(String[] args) {
        int a = 10, b = 20, res=0;
        A_Test test1 = new A_Test();
        res=test1.add(a,b);
        System.out.println(res);
    }
}
class A_Test extends B_Test {

    @Override
    public int add(int a, int b) {
        return a+b;
    }
}


// 추상 클래스 : 내용을 정의하지 않은 추상적인 틀
abstract class B_Test {
    public abstract int add(int a, int b);
}

interface  C_Test {
    public abstract int add(int a, int b);
}