import java.util.Scanner;

public class IfTest02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("나이를 입력하세요: ");
		int age = sc.nextInt();
		if (age >= 19) {
			System.out.println("성인입니다.");
			System.out.println("술집입장");
		}
		else if (age>=13) {
			System.out.println("청소년입니다.");
			System.out.println("집");
		}
		else {
				if(age >= 10) {
					System.out.println("초등학생입니다");
				}
		else {
			System.out.println("어린이입니다.");
			System.out.println("집");
		}
	  }
		//if문은 실행할 문장이 딱 한줄 일땐 {} 생략가능, 항상 {}
	}

}
