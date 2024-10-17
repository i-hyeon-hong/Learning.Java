
public class Operator7 {

	public static void main(String[] args) {
		// TODO : 연산자의 대해 알아보기

		// 삼항 조건 연산자(삼항 연산자)
		// 조건식 ? 참값:거짓값
		int age = 19;
		boolean adult;
		
		adult = age >= 19 ? true:false;
		if(age >= 19 ) {
			adult = true;
			
		} else {
			adult = false;
		}
		System.out.println(adult);
				
	}

}
