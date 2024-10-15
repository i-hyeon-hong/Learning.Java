import java.util.Scanner;

public class SwitchTest5 {

	public static void main(String[] args) {
		// 나라를 입력
		Scanner sc = new Scanner(System.in);
		System.out.print("나라: ");
		String country = sc.next();
		// next 단어에 적합(공백을 기준으로 반환)
		// nextLine 문장에 적합(엔터키를 기준으로 반환)

		// 소문자로 변환
		// country = country.toLowerCase();
		// 대문자로 변환
		// country=country.toUpperCase()

		switch (country) {
		case "Korea":
			System.out.println("서울");
			break;
		case "Japan":
			System.out.println("도쿄");
			break;
		case "China":
			System.out.println("베이징");
			break;
		}
	}

}
