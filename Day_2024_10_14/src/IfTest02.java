import java.util.Scanner;

public class IfTest02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("나이를 입력하세요: ");
		int age = sc.nextInt();
		//if문은 실행할 문장이 한 줄 일 땐 {} 생략 가능, 항상 {}
		if (age >= 19) {
			System.out.println("성인 입니다.");
			System.out.println("술집에 입장 가능합니다");
		}
		else if (age>=13) {
			System.out.println("청소년 입니다.");
			System.out.println("집으로 돌아 가야 합니다.");
		}
		else {
				if(age >= 10) {
					System.out.println("초등학생입니다");
				}
		else {
			System.out.println("어린이 입니다.");
			System.out.println("집으로 돌아 가야 합니다.");
		}
	  }
	}

}
