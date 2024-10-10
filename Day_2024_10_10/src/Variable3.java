
public class Variable3 {

	public static void main(String[] args) {
		// 문자형 char는 한 글자만 저장, 정수로 표현 가능
		char c = '한';
		System.out.println(c);
		int i = c;
		System.out.println(i);
		// 확장열(Escape sequence)
		// \n : 개행
		System.out.println("개행\n");
		// \t : 탭
		System.out.println("탭\t");
		// "안녕하세요"
		// \" : 큰따옴표 출력 가능
		System.out.println("\"안녕하세요\"");
		// \'
		c = '\'';
		System.out.println(c);
		System.out.println("프로그램 종료");

	}

}