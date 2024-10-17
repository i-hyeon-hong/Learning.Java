import java.util.Scanner;

public class Operator8 {

	private static Scanner sc;
	public static Integer number;

	public static void main(String[] args) {
		// TODO : 입력 받은 정수가 짝수인 지 홀수 인 지 판별
		sc = new Scanner(System.in);
		System.out.print("정수 : ");
		SetNumber(sc.nextInt());
		System.out.println(isEvenNumber(GetNumber()));

	}

	private static void SetNumber(Integer i) {
		number = i;
	}

	private static Integer GetNumber() {
		return number;
	}

	private static boolean isEvenNumber(Integer i) {
		return i % 2 == 0 ? true : false;
	}
}
