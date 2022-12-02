package Exception;

import java.util.ArrayList;
import java.util.List;

public class IndexOutOfBoundsException {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();

        list.add("추가");

        System.out.println(list.get(1));
    }
}
