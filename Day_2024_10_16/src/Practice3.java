import java.util.ArrayList;

public class Practice3 {

	static ArrayList<Integer> numbers;
	static Integer temp;

	public static void main(String[] args) {
		// TODO : 반복문을 이용하여 수열 출력하기

		// Initial variable
		numbers = new ArrayList<Integer>();
		try {
			// TODO : 5와 7의 최소 공배수 구하기
			if (temp == null || temp < 5) {
				temp = 5;
			}
			while (true) {
				temp += 5;
				if (temp % 5 == 0 && temp % 7 == 0) {
					numbers.add(temp);
					break;
				}
			}
			SetNumbers(numbers);
			System.out.println(GetNumbers());
			numbers.clear();
		} catch (Exception e) {
			// TODO: handle exception
		}
		try {
			// TODO : 1에서 20까지 3의 배수를 제외한 정수의 배열
			if (temp == null || temp < 1) {
				temp = 1;
			}
			for (temp = 0; temp <= 20; temp++) {
				if (temp % 3 != 0) {
					numbers.add(temp);
				}
			}
			SetNumbers(numbers);
			System.out.println(GetNumbers());
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
