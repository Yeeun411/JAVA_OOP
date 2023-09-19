package Assignment;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("연산>>> ");
        String input = scanner.nextLine();
        String[] tokens = input.split(" ");

        if (tokens.length != 3) {
            System.out.println("올바른 형식의 입력이 필요합니다.");
            return;
        }

        try {
            int operand1 = Integer.parseInt(tokens[0]);
            String operator = tokens[1];
            int operand2 = Integer.parseInt(tokens[2]);

            int result = 0;
            boolean isValidOperation = true;

            switch (operator) {
                case "+":
                    result = operand1 + operand2;
                    break;
                case "-":
                    result = operand1 - operand2;
                    break;
                case "*":
                    result = operand1 * operand2;
                    break;
                case "/":
                    if (operand2 == 0) {
                        System.out.println("0으로 나눌 수 없습니다.");
                        isValidOperation = false;
                    } else {
                        result = operand1 / operand2;
                    }
                    break;
                default:
                    System.out.println("지원하지 않는 연산자입니다.");
                    isValidOperation = false;
            }

            if (isValidOperation) {
                System.out.println(operand1 + " " + operator + " " + operand2 + " = " + result);
            }
        } catch (NumberFormatException e) {
            System.out.println("올바른 형식의 입력이 필요합니다.");
        }

        scanner.close();
    }
}
