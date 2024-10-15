import java.util.Scanner;

public class Calc2 {

	public static void main(String[] args) {
		// 간단한 사칙연산을 위한 계산기
		int num1;
		int num2;
		String opr;
		double result;
		Scanner sc = new Scanner(System.in);
		System.out.print("첫 번째 정수를 입력해주세요 : ");
		num1 = sc.nextInt();
		System.out.print("연산자를 입력 해주세요. : ");
		opr = sc.next();
		switch (opr) {
		case "+":
			System.out.print("두 번째 정수를 입력해주세요 : ");
			num2 = sc.nextInt();
			result = num1 + num2;
			System.out.println(num1 + "+" + num2 + "= " + result);
			break;
		case "-":
			System.out.print("두 번째 정수를 입력해주세요 : ");
			num2 = sc.nextInt();
			result = num1 - num2;
			System.out.println(num1 + "-" + num2 + "= " + result);
			break;
		case "*":
			System.out.print("두 번째 정수를 입력해주세요 : ");
			num2 = sc.nextInt();
			if (num2 == 0) {
				System.out.println("0으로 곱할 수 없습니다.");
				break;
			} else {
				result = (double) num1 * num2;
				System.out.println(num1 + "*" + num2 + "= " + result);
				break;
			}
		case "/":
			System.out.print("두 번째 정수를 입력해주세요 : ");
			num2 = sc.nextInt();
			if (num2 == 0) {
				System.out.println("0으로 나눌 수 없습니다.");
				return;
			} else {
				result = (double) num1 / num2;
				System.out.println(num1 + "/" + num2 + "= " + result);
				break;
			}
		default:
			System.out.println("정확한 사칙연산자를 입력 해주세요.");
			return;
		}
	}

}
