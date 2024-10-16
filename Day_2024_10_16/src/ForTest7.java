import java.util.Scanner;

public class ForTest7 {
	private static Scanner sc;
	private static int grade;
	public static void main(String[] args) {
		// TODO : 1학년 이상이고 6학년 이하, 잘못된 학년이 입력되면 에러 메세지 출력
		sc = new Scanner(System.in);
		while(true) {
			System.out.print("학년(1~6년) : ");
			SetGrade(sc.nextInt());
			if(grade >= 1 && grade <= 6) {
				break;
			} else {
				System.out.println("학년을 다시 입력 해주세요.");
			}
		}
		System.out.println(grade + "학년 입니다.");
	}
	
	private static void SetGrade(int i) {
		grade = i;
	}
	
	private static int GetGrade() {
		return grade;
	}

}
