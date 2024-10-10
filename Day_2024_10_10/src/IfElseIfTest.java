import java.util.Scanner;

public class IfElseIfTest {

	public static void main(String[] args) {
		// 1을 입력했을 때 메세지 표시
		// 2를 입력했을 때 메세지 표시
		// 아닐 경우 그 외 정수를 입력했을 때 메세지 표시
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력해주세요.");
		num = sc.nextInt();
		if (num == 1) {
			System.out.println("정수 1 입니다.");
		} else if (num == 2) {
			System.out.println("정수 2 입니다.");
		} else if (num == 3) {
			System.out.println("정수 3 입니다.");
		} else {
			System.out.println("1,2,3 중 입력 해주세요.");
		}
		System.out.println("프로그램 종료");
		return;
	}
}
