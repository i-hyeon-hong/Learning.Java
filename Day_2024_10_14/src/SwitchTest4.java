import java.util.Scanner;

public class SwitchTest4 {

	public static void main(String[] args) {
		//월을 입력 받아서 며칠까지 있는지
		Scanner sc = new Scanner(System.in);
		System.out.print("월: ");
		int month = sc.nextInt();
		int days= 0; //일
		switch(month) {
		case 2:
			days = 28;
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			days=30;
			break;
		default:
			days=31;
		}
		System.out.println(month +"월은 "+ days +"일까지 있다.");
	}

}
