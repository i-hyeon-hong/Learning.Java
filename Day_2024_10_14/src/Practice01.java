import java.util.Scanner;

public class Practice01 {

	public static void main(String[] args) {
		// 양의 정수를 입력받아서 홀수인가 짝수인가 결과 출력
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하세요: ");
		int num = sc.nextInt();

		if (num % 2 == 0) {
			System.out.println("결과:짝수");
		} else {
			System.out.println("결과:홀수");
		}

	}

}
