
public class DoWhileTest {

	public static void main(String[] args) {
		// Do ~ while
		int i = 1; // 초기화식
		// 먼저 실행한 후에 조건식에 부합하면 반복 실행
		do {
			System.out.println(i + "번 반복하고 있습니다");
			i++;
		} while (i <= 10);
		System.out.println((i - 1) + "번 반복 완료");

	}
}
