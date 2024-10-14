import java.util.Scanner;

public class SwitchTest3 {

	public static void main(String[] args) {
		//랭킹을 입력받아서 메달 수여
		Scanner sc = new Scanner(System.in);
		System.out.print("랭킹: ");
		int rank = sc.nextInt();
		
		//1: 대상 2,3:우수상 4,5: 장려상
		switch(rank) {
		case 1:
			System.out.println("대상");
			break;
		case 2:
		case 3:
			System.out.println("우수상");
			break;
		case 4:
		case 5:
			System.out.println("장려상");
			break;
		}
		
	}

}
