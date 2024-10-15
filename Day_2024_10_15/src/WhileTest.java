
public class WhileTest {

	public static void main(String[] args) {
		// while
		int i = 1; // 초기화식
		while (i <= 10) {
			System.out.println(i + "번 반복하고 있습니다");
			i++; // 증감식은 반복문의 마지막에 작성
		}
		System.out.println((i - 1) + "번 반복 완료");

	}

}
