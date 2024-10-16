
public class ForTest3 {

	public static void main(String[] args) {
		// TODO : 1부터 100까지 4의 배수의 합계를 구하라.
		int result = 0;
		for(int i = 1; i <= 100; i++) {
			if(i % 4 == 0) {
				result = result + i;
			}
		}
		System.out.println(result);
	}

}
