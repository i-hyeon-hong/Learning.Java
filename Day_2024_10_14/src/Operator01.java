
public class Operator01 {

	public static void main(String[] args) {
		int num1 = 11;
		int num2 = 6;
		// +, -, * ,/
		System.out.println(num1 + num2);// 덧셈
		System.out.println(num1 - num2);// 빼기
		System.out.println(num1 * num2);// 곱하기
		System.out.println(num1 / num2);// 나누기
		// 정수 대 정수 연산은 정수로만 반환(int/double)
		// 나머지 연산자 : % (나머지를 반환)
		System.out.println(num1 % num2);// 나눠서 남은 나머지 반환
		// 짝수, 홀수
		System.out.println(num1 % 2 == 0); // 짝수
		System.out.println(num1 % 2 != 0); // 홀수
	}

}
