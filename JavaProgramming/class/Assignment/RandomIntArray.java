package Assignment;

import java.util.Random;

public class RandomIntArray {
    public static void main(String[] args) {
        // 정수를 10개 저장하는 배열을 생성
        int[] numbers = new int[10];
        Random random = new Random();
        
        int sum = 0;

        // 1에서 10까지 범위의 정수를 랜덤하게 생성하여 배열에 저장
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(10) + 1; // 1에서 10까지의 정수를 생성
            sum += numbers[i]; // 합계 구하기
        }

        // 배열에 든 숫자들을 출력
        System.out.print("랜덤한 정수들 : ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println(); // 줄바꿈

        // 평균을 출력
        double average = (double) sum / numbers.length;
        System.out.printf("평균 : %.1f", average);
    }
}
