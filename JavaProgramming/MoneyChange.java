package Assignment;
import java.util.Scanner;

public class MoneyChange {
	public static void main(String[] args) {
		
        Scanner scanner = new Scanner(System.in);

        System.out.print("금액 : ");
        int amount = scanner.nextInt();

        int fiftyThousand = amount / 50000;
        amount %= 50000;

        int tenThousand = amount / 10000;
        amount %= 10000;

        int fiveThousand = amount / 5000;
        amount %= 5000;

        int oneThousand = amount / 1000;
        amount %= 1000;

        int fiveHundred = amount / 500;
        amount %= 500;

        int oneHundred = amount / 100;
        amount %= 100;

        int fifty = amount / 50;
        amount %= 50;

        int ten = amount / 10;
        amount %= 10;

        int one = amount;

        System.out.println("오만원권 : " + fiftyThousand + " 매");
        System.out.println("만원권 : " + tenThousand + " 매");
        System.out.println("오천원권 : " + fiveThousand + " 매");
        System.out.println("천원권 : " + oneThousand + " 매");
        System.out.println("오백원 : " + fiveHundred + " 개");
        System.out.println("백원 : " + oneHundred + " 개");
        System.out.println("오십원 : " + fifty + " 개");
        System.out.println("십원 : " + ten + " 개");
        System.out.println("일원 : " + one + " 개");

        scanner.close();
    }
}
