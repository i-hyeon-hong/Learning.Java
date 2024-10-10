import java.util.Scanner;

public class IfTest2 {

	public static void main(String[] args) {
		// 점수를 입력 받아서 분기 처리
		Scanner sc = new Scanner(System.in);
		System.out.print("점수 : ");
		// 정수를 입력 받아서 score에 대입
		int score = sc.nextInt();
		boolean pass;
		if (score >= 70) {
			// 조건이 true일 때 실행 될 코드
			pass = true;
		} else {
			pass = false;
		}
		
		System.out.println("프로그램 종료");

	}
}
