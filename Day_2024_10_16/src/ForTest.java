
public class ForTest {

	public static void main(String[] args) {
		// TODO : 1부터 100까지의 홀수의 합을 구하라.
		int result = 0;
		for (int i = 1; i <= 100; i++) {
			if (i % 2 != 0) {
				result = result + i;
			}
		}
		System.out.println(result);
	}

}
