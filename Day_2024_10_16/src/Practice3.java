import java.util.ArrayList;

public class Practice3 {

	static ArrayList<Integer> numbers;
	static ArrayList<Integer> temp;

	public static void main(String[] args) {
		// TODO : 반복문을 이용하여 수열 출력하기
		temp = new ArrayList<Integer>();
		try {
			int i = 0;
			while(true) {
				i = i+=5;
				if(i % 5 == 0 && i % 7 == 0) {
					temp.add(i);
					break;
				}
			}
			SetNumbers(temp);
			System.out.println(numbers);
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
