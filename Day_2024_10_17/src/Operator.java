
public class Operator {

	public static void main(String[] args) {
		// TODO : 연산자의 대해 알아보기

		int number1 = 10;
		int number2 = 6;

		// 정수 : 정수와 정수의 연산의 결과는 정수
		System.out.println(number1 / number2);

		// 정수와 실수의 연산 : 피연산자 중에서 하나라도 실수라면 결과는 실수
		System.out.println(number1 / (double) number2);
		System.out.println(366 / (double) 4);

		// 나머지 연산자 : 두 수를 나눈 후 몫은 버리고 나머지만 취함
		// 연산의 우선순위가 최후순위
		System.out.println(number1 % number2);
	}

}