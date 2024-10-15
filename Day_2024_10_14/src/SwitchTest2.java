import java.util.Scanner;

public class SwitchTest2 {

	public static void main(String[] args) {
		// 랭킹을 입력받아서 메달 수여
		Scanner sc = new Scanner(System.in);
		System.out.print("랭킹: ");
		int rank = sc.nextInt();

		// 1:금메달, 2:은메달, 3:동메달, 그외:참가상
		switch (rank) {
		case 1:
			System.out.println("금메달");
			break;
		case 2:
			System.out.println("은메달");
			break;
		case 3:
			System.out.println("동메달");
			break;
		default:
			System.out.println("참가상");
		}

//		if(rank==1) {
//			System.out.println("금메달");
//		}
//		else if(rank==2) {
//			System.out.println("은메달");
//		}
//		else if(rank==3) {
//			System.out.println("동메달");
//		}
//		else {
//			System.out.println("참가상");
//		}
//	
	}

}
