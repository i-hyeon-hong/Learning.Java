
public class ForTest4 {

	public static void main(String[] args) {
		// TODO : 0부터 시작해서 0.5씩 증가해서 3.0 미만일 때까지 출력
		for (double d = 0; d < 3.0; d += 0.5) {
			// 1.5를 생략하고 출력
			if(d == 1.5) {
				continue;
			}
			System.out.println(d);
		}
	}

}
