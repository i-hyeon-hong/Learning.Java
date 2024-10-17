
public class Operator6 {

	public static void main(String[] args) {
		// TODO : 연산자의 대해 알아보기

		// 논리 연산자

		// && : and(논리곱), 양변이 모두 참일 때만 참을 반환(조건식1과 2가 모두 참 일 때)
		// 조건식1 && 조건식2
		int number = 10;
		if(number > 5 && number++ > 10) {
			System.out.println(true);
		}
		// || : or(논리합), 양변 중 하나라도 참이면 참을 반환(조건식1과 2 중에 하나라도 참일 때)
		// 조건식1 || 조건식2
		number = 10;
		if(number < 5 || number++ > 8) {
			System.out.println(true);
		}
		// ! : not(논리부정), 논리값의 평가 결과를 반대로 전환(True→False)
		if(!(number>5)) {
			System.out.println(true);	
		}
		
		boolean isMan = false;
		
		if(!isMan) {
			isMan = true;
		}
		
	}

}
