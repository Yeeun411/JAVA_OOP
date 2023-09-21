package Study;
import java.util.Scanner;

public class Bronze_1267 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int N = sc.nextInt();
            int[] times = new int[N];
            for (int i = 0; i < N; i++) {
                times[i] = sc.nextInt();
            }

            int yBill = 0;  // 영식 요금제
            int mBill = 0;  // 민식 요금제

            for (int time : times) {
                yBill += (time / 30 + 1) * 10;
                mBill += (time / 60 + 1) * 15;
            }

            if (yBill < mBill) {
                System.out.println("Y " + yBill);
            } else if (yBill > mBill) {
                System.out.println("M " + mBill);
            } else {
                System.out.println("Y M " + yBill);
            }
        }
    }
}
