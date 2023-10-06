package Assignment;
import java.util.Scanner;

class Add{
	int a;
	int b;
	void setValue(int a, int b) {
		this.a = a;
		this.b = b;
	}
	int calculate() {
		return a+b;
	}
	
}

class Sub{
	int a;
	int b;
	void setValue(int a, int b) {
		this.a = a;
		this.b = b;
	}
	int calculate() {
		return a-b;
	}
	
}

class Mul{
	int a;
	int b;
	void setValue(int a, int b) {
		this.a = a;
		this.b = b;
	}
	int calculate() {
		return a*b;
	}
	
}

class Div{
	int a;
	int b;
	void setValue(int a, int b) {
		this.a = a;
		this.b = b;
	}
	int calculate() {
		return a/b;
	}
	
}

public class Calculator2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("정수 연산자 입력 : ");
		
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		
		String operator = scanner.next();
		int result = 0;
		
		switch (operator) {
        case "+":
            Add add = new Add();
            add.setValue(a, b);
            result = add.calculate();
            break;
        case "-":
            Sub sub = new Sub();
            sub.setValue(a, b);
            result = sub.calculate();
            break;
        case "*":
            Mul mul = new Mul();
            mul.setValue(a, b);
            result = mul.calculate();
            break;
        case "/":
            Div div = new Div();
            div.setValue(a, b);
            try {
                result = div.calculate();
            } catch (ArithmeticException e) {
                System.out.println("Error: " + e.getMessage());
                scanner.close();
                return;
            }
            break;
        default:
            System.out.println("지원하지 않는 연산자입니다.");
            scanner.close();
            return;
		}
    
    System.out.println(a + operator + b + "=" + result);
    scanner.close();
	}

}
