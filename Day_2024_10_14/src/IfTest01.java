import java.util.Scanner;

public class IfTest01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("나이를 입력하세요: ");
		int age = sc.nextInt();
		if (age >= 19) {
			System.out.println("성인입니다.");
			System.out.println("담배 살 수 있어요");
		}
		else {
			System.out.println("미성년자입니다.");
		}
		//if문은 실행할 문장이 딱 한줄 일땐 {} 생략가능, 항상 {}
	}

}
