import java.util.Scanner;

public class IfTest03 {

	public static void main(String[] args) {
		// 뷔페
		// 성인남성: 25000원, 성인여성: 21000원, 청소년: 15000원
		Scanner sc = new Scanner(System.in);
		System.out.print("나이 성별 입력하세요.");

		int age = sc.nextInt();
		boolean man = sc.nextBoolean(); // true: 남, false: 여

		if (age >= 19) {
			if (man == true) {
				System.out.println("성인남성: 25,000원");
			} else {
				System.out.println("성인여성: 21,000원");
			}
		} else {
			System.out.println("청소년: 15,000원");
		}

		boolean bool = true;
		if (bool) {
			System.out.println("실행");

		}
	}
}
