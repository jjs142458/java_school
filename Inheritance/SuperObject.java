public class SuperObject {
    protected String name;

    public SuperObject() {
        this.name = "초기값";
    }

    public SuperObject(String name) {
        this.name = name;
    }

    public void draw() {
        System.out.println("SuperObject " + name);
    }

    public void paint() {
        draw();
    }

    public static void main(String[] args) {
        SuperObject sObj = new SuperObject();

        sObj.paint();

        // 업캐스팅
        SuperObject subObj = new SubObject();
        subObj.paint();
        // 다운캐스팅
        SubObject test;

        if(subObj instanceof SubObject) {
            test = (SubObject) subObj;
            test.ptrTest();
        } else {
            subObj.paint();
        }

    }
}
