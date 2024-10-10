import java.util.Scanner;

public class IfElseTest {

	public static void main(String[] args) {
		// 1을 입력했을 때 메세지 표시, 
		// 아닐 경우 그 외 정수를 입력했을 때 메세지 표시
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력해주세요.");
		num = sc.nextInt();
		if (num == 1) {
			System.out.println("정수 1이 입니다.");
		} else {
			System.out.println("정수 1이 아닙니다.");
		}
		System.out.println("프로그램 종료");
		
	}
}
