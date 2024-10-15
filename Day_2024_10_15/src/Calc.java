
public class Calc {

	public static void main(String[] args) {
		// 간단한 사칙연산을 위한 계산기
		int num1 = 10;
		int num2 = 6;

		// int type의 데이터를 double type의 데이터로 Casting
		double result = (double) num1 / num2;
		System.out.println(result);
		// 정수와 정수의 연산 결과값은 정수
		// 실수와 실수의 연산 결과값은 실수
		// 실수와 정수의 연산 결과값은 실수(연산 대상의 앞 뒤는 상관 없음)
	}

}
