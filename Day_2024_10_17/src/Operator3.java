
public class Operator3 {

	public static void main(String[] args) {
		// TODO : 연산자의 대해 알아보기

		// 증감 연산자(단항 연산자)의 전위형
		int value = 2;
		int a = ++value;
		System.out.println("value = " + value + ", a = " + a);

		// 증감 연산자(단항 연산자)의 후위형
		value = 2;
		a = value++;
		System.out.println("value = " + value + ", a = " + a);

	}

}
