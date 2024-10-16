
public class ForTest5 {

	public static void main(String[] args) {
		// TODO : 1부터 1씩 증가시키는 것을 더해서 100을 초과하는 시점을 구하라.
		int result = 0;
		for (int i = 1; i <= 100; i++) {
				result = result + i;
				if(result > 100) {
					System.out.println(i);
					break;
				}
			}
		}
	}


