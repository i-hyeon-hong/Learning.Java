import java.util.Scanner;

public class Main{

	private Integer a;
	
	public Main() {
		
	}
	public Main(Integer i) {
		this.a = i;
	}
	public static void main(String[] arsg) {
		Main man = new Main();
		byte a = 127;
		byte b = 127;
		
		Byte by;
		String str = "1";
		Integer i = 1;
		
		Scanner sc = new Scanner(System.in);
		try {
			str = sc.next();
			man.isEvenNumber(i.toString());
				
		} catch(Exception e){
			
		}
		
		
		short s = (short) (a + b);
		
		
	}
	
	public String isEvenNumber(String i) {
		return i;
	}
	
	public void SetA(Integer n) {
		a = n;
	}
	
	public Integer GetA() {
		return a;
	}
	
}
