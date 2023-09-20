package Assignment;

import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;
import java.util.List;

public class UniqueRandomArray {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            Random random = new Random();

            System.out.print("정수 개수 입력 : ");
            int n = scanner.nextInt();

            while (n < 1 || n > 100) {
                System.out.println("1 이상 100 미만의 숫자를 입력해주세요.");
                System.out.print("정수 개수 입력 : ");
                n = scanner.nextInt();
            }

            List<Integer> uniqueNumbers = new ArrayList<>();

            // 중복 없이 랜덤한 정수 삽입
            while (uniqueNumbers.size() < n) {
                int randNum = random.nextInt(100) + 1;
                if (!uniqueNumbers.contains(randNum)) {
                    uniqueNumbers.add(randNum);
                }
            }

            // 한 줄에 10개씩 숫자 출력
            for (int i = 0; i < n; i++) {
                System.out.printf("%-3d", uniqueNumbers.get(i));
                if ((i + 1) % 10 == 0) {
                    System.out.println();
                }
            }
        }
    }

    // 배열 내에 중복된 숫자가 있는지 확인하는 함수
    public static boolean containsDuplicate(List<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i).equals(list.get(j))) {
                    return true;
                }
            }
        }
        return false;
    }
}