import java.util.ArrayList;

public class Practice2 {

	static ArrayList<Integer> numbers;
	static ArrayList<Integer> temp;
	
	public static void main(String[] args) {
		// TODO : 반복문을 이용하여 수열 출력하기
		temp = new ArrayList<Integer>();
		try {
			// 양의 정수 중에서 5의 배수이자 7의 배수이 첫번째 수
			for (int i = 1; ; i++) {
				if(i % 5 == 0 && i % 7 == 0) {
					temp.add(i);	
				}
			}
			SetNumbers(temp);
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	private static void SetNumbers(ArrayList<Integer> array) {
		numbers = array;
	}
	private static ArrayList<Integer> GetNumbers() {
		return numbers;
	}

}
