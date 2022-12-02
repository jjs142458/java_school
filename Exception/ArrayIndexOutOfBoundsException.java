package Exception;

public class ArrayIndexOutOfBoundsException {
    public static void main(String[] args) {
        String games[] = new String[]{"후부키"};

        for (int i = 0; i < 5; i++) System.out.println(games[i]);
    }
}
