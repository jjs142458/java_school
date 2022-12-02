package Method.Math;

import java.util.Scanner;

public class random {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int res = (int)(Math.random()*100 + 1);
        int pick;

        System.out.println(res);
        for (int i = 0; i < 5; i++) {
            System.out.print("숫자를 입력해주세요: ");
            pick = in.nextInt();
            if (res != pick) {
                if (pick > res) {
                    System.out.println(pick + "은(는) 정답보다 큽니다.");
                }
                if (pick < res) {
                    System.out.println(pick + "은(는) 정답보다 작습니다.");
                }
            }
            if (res == pick) {
                System.out.println(res + " 정답입니다.");
                break;
            }
        }


    }
}
