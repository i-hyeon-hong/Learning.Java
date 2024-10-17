import java.util.Scanner;

public class Operator8 {

	private Scanner sc;
	private Integer number;

	public static void main(String[] args) {
		Operator8 opr = new Operator8();
		// TODO : 입력 받은 정수가 짝수인 지 홀수 인 지 판별
		opr.sc = new Scanner(System.in);
		System.out.print("정수 : ");
		opr.SetNumber(opr.sc.nextInt());
		System.out.println(opr.isEvenNumber(opr.GetNumber()));

	}

	public void SetNumber(Integer i) {
		number = i;
	}

	public Integer GetNumber() {
		return number;
	}

	public boolean isEvenNumber(Integer i) {
		return i % 2 == 0 ? true : false;
	}
}
