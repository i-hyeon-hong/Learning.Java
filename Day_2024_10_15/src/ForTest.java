
public class ForTest {

	public static void main(String[] args) {
		// 5번 반복
		// 조건 값 초기화 → 루프를 반복할 범위(조건식) →
		// 조건식을 만족하면 반복문 실행 → 반복할 조건 값의 연산(증감식)
		// 제어 변수 i(Index)
		// i 의 값이 1 씩 증가
		// 복합 대입연산자 i += 1;
		// 복합 대입연산자 i++, ++i; (1 한정, 단항 연산자)
		// i 의 값이 1 씩 감소
		// 복합 대입연산자 i -= 1; (1 한정, 단항 연산자)
		// 복합 대입연산
		for (int i = 0; i < 5; i++) {
			System.out.println("반복하고 있습니다.");
		}
		return;
	}
}
