import java.util.Scanner;

public class IfTest01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("나이를 입력하세요: ");
		int age = sc.nextInt();
		// if 문은 실행할 문장이 {} 생략 가능, 항상 {}
		if (age >= 19) {
			System.out.println("성인 입니다.");
			System.out.println("담배를 구입 가능합니다.");
		} else {
			System.out.println("미성년자 입니다.");
		}
	}

}
