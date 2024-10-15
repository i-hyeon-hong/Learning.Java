
public class WhileTest2 {

	public static void main(String[] args) {
		// while
		// n부터 n2까지 더하기

		// 1부터 10까지 더하기
		int result = 0; // 덧셈의 결과

		int i = 1; // 초기화 식

		while (i <= 10) {
			result = result + i;
			i++;
		}

		System.out.println(result);

	}
}
