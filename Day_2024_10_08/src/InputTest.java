import java.util.Scanner;

public class InputTest {

	public static void main(String[] args) {
		// TODO : Test about Input
		// ctrl+/ : 한줄 주석 작성&해제
		// ctr+shift+/ : 블록 주석 /* */
		// ctr+shift+\ : 블록 주석 해제 /* */
		// ctrl+a : 전체 선택
		// ctrl+shit+f : 코드 정리
		// ctrl+d : 한 줄 라인 지우기
		// ctrl+shift+o : import short cut
		Scanner scanner = new Scanner(System.in);
		System.out.print("이름을 입력하세요: ");
		String name = scanner.next();
		System.out.println("입력한 이름: " + name);
		System.out.print("나이: ");
		int age = scanner.nextInt();
		System.out.println("입력한 나이: " + age);
		// 명명 규칙(Camel Case)
		String userID = "abc123";
		System.out.println(userID);
	}

}
