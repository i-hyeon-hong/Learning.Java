
public class RoopTest {

	public static void main(String[] args) {
		// 1~10까지 더 한 값
		int result = 0;
		// 조건 값 초기화 → 루프를 반복할 범위(조건식) →
		// 조건식을 만족하면 반복문 실행 → 반복할 조건 값의 연산(증감식)
		// 제어 변수 i
		// i 의 값이 1 씩 증가
		// 복합 대입연산자 i += 1;
		// 복합 대입연산자 i++, ++i;
		for (int i = 1; i <= 10; i++) {
			result = result + i;
		}
		System.out.println(result);

		// 25부터 77까지의 합
		for (int i = 25; i <= 77; i++) {
			result = result + i;
		}
		System.out.println(result);

		return;
	}
}
