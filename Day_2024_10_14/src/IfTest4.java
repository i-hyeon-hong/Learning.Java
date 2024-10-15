import java.util.Scanner;

public class IfTest4 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("점수: ");
		int score = sc.nextInt();
		// || 연결 연산자는 OR의 의미
		if (score > 100 || score < 0) {
			// 0~100
			System.out.println("점수를 제대로 입력해주세요");
			// 프로그램의 종료
			System.exit(0);
			// method를 종료 하고 값을 반환
			return;
		}
		// 90~100 : A
		if (score >= 90) {
			System.out.println("A");
		} else if (score >= 80 && score <= 89) {
			// && 연결 연산자는 And의 의미
			System.out.println("B");
		} else if (score >= 70) {
			System.out.println("C");
		} else if (score >= 60) {
			System.out.println("D");
		} else {
			System.out.println("F");
		}
	}

}
