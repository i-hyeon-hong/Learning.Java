import java.util.Scanner;

public class IfTest3 {

	public static void main(String[] args) {
		// 1을 입력했을 때만 메세지 표시
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력해주세요.");
		num = sc.nextInt();
		if (num == 1) {
			System.out.println("정수 1이 입력 되었습니다.");
		}
		System.out.println("프로그램 종료");

	}
}
