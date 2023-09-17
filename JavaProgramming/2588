import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();  // 첫번째 세자리수
        int B = scanner.nextInt();  // 두번째 세자리수

        // 첫번째 계산: (1)의 일의 자리와 (2)를 곱함
        int firstStep = A * (B % 10);

        // 두번째 계산: (1)의 십의 자리와 (2)를 곱함
        int secondStep = A * ((B % 100) / 10);

        // 세번째 계산: (1)의 백의 자리와 (2)를 곱함
        int thirdStep = A * (B / 100);

        // 최종 계산: (1)과 (2)를 곱함
        int result = A * B;

        // 출력
        System.out.println(firstStep);
        System.out.println(secondStep);
        System.out.println(thirdStep);
        System.out.println(result);
    }
}
