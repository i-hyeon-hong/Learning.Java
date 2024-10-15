
public class BreakTest {

	public static void main(String[] args) {
		// break 키워드는 반복문의 종료
		// 1부터 10까지 i의 값이 증가하는 반복하는 중에 i의 값이 7이면 반복문 종료
		for (int i = 1; i <= 10; i++) {
			if (i == 7) {
				System.out.println(i);
				break;
			}
			System.out.println(i);
		}

		// 1부터 20까지 i의 값이 증가하는 반복하는 반복문에서 i의 값이 13이면 반복문 종료
		for (int i = 1; i <= 20; i++) {
			if (i == 13) {
				System.out.println(i);
				break;
			}
			System.out.println(i);
		}
	}

}
