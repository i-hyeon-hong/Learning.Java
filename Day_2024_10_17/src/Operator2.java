
public class Operator2 {

	public static void main(String[] args) {
		// TODO : 연산자의 대해 알아보기

		int number1 = 10;

		// 대입 연산자
		number1 = number1 + 1;
		System.out.println(number1);

		// 복합대입연산자
		number1 =+ 1;
		System.out.println(number1);

		// 단항연산자의 전위형 : 변수의 값을 먼저 증가시킨 후 반환
		number1 = 0;
		System.out.println(number1++);
		System.out.println(number1);

		// 단항연산자의 후위형 : 변수의 값을 먼저 반환하고 증가
		number1 = 0;
		System.out.println(++number1);
		System.out.println(number1);

	}

}
