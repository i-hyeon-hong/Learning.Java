
public class ContinueTest {

	public static void main(String[] args) {
		// Continue는 반복문에서 다음 증감식으로 진행
		// Continue 키워드 아래에 작성된 코드가 없다면 의미가 없다.
		// 1부터 10까지 i가 증감하는 반복문에서 i의 값이 7이면 다음 증감식으로
		for (int i = 1; i <= 10; i++) {
			// i의 값이 7일 경우 반복문의 증감식으로
			if (i == 7) {
				continue; // 다음 단계로
			}
			System.out.println(i);
		}
		// 1부터 20까지 i가 증감하는 반복문에서 i의 값이 13이면 다음 증감식으로
		for (int i = 1; i <= 10; i++) {
			// i의 값이 13일 경우 반복문의 증감식으로
			if (i == 13) {
				continue; // 다음 단계로
			}
			System.out.println(i);
		}

	}

}
