import java.util.Scanner;

public class SwitchTest1 {

	public static void main(String[] args) {
		// 1과 2를 입력했을때 메시지 표시
		Scanner sc = new Scanner(System.in);
		System.out.print("정수: ");
		int num = sc.nextInt();

		switch (num) {
		case 1:
			System.out.println("1을 입력");
			break;
		case 2:
			System.out.println("2를 입력");
			break;
		default:
			System.out.println("1 또는 2를 입력하세요.");
		}
		// break를 안쓰면 해당 case 이후 모든 문장 반환.
		// default에는 break안해도 무방
		// ㄱㅈㅅ,ㅂㅎㅈ,ㅅㅈㅎ,ㅂㅈㅇ,ㅇㄱㅎ,ㅇㅇㅇ,ㅂㅁㅈ,ㄱㅅㅁ,ㅇㄷㅎ

	}

}
