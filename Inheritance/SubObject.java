public class SubObject extends SuperObject {

    public SubObject() {
        super("자식 초기값");
    }

    @Override
    public void draw() {
        System.out.println("SubObject " + name);
    }

    public void ptrTest() {
        System.out.println("test");
    }
}
