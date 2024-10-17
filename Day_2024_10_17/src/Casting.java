
public class Casting {

	public static void main(String[] args) {
		// TODO : 캐스팅 연산자에 대해 이해하기

		// 형(type) 변환
		// 정수 : byte → short → int → long
		// 화살표 방향으로 자동 변환 가능
		short s = 0;
		byte b = 1;
		s = b;
		System.out.println(s);
		// 정수와 실수
		// 정수 : 덜 정밀한 타입 & 실수 : 더 정밀한 타입
		// 정수형 → 실수형
		// 화살표 방향으로 자동 변환 가능
		int i = 1;
		double d = i;
		System.out.println(d);
		// 강제형 변환
		i = (int)d;
		System.out.println(i);
	}

}
