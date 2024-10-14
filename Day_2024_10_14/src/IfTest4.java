import java.util.Scanner;

public class IfTest4 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("점수: ");
		int score = sc.nextInt();
				
		//90~100 : A
		if(score >=90) {
			System.out.println("A");
		}
		else if(score >=80 && score <= 89) {//&&두개로 and의미 부여
			System.out.println("B");
		}
		else if(score>=70) {
			System.out.println("C");
		}
	}

}
