
public class DoWhileTest2 {

	public static void main(String[] args) {
		// Do ~ while
		// 1부터 10까지 더하기
		int result = 0; // 덧셈의 결과

		int i = 1; // 초기화 식
		do {
			result = result + i;
			i++;
		} while (i <= 10);

		System.out.println(result);

	}
}
