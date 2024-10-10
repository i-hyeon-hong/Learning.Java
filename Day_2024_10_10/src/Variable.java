
public class Variable {

	public static void main(String[] args) {
		// byte 끼리는 Overflow 떄문에 연산 불가
		byte b1 = 1;
		byte b2 = 2;
		// byte b3 = b1 + b2;
		// byte 끼리 연산하려면 캐스팅 해야함
		short b3 = (short) (b1 + b2);
		// short 끼리는 Overflow 떄문에 연산 불가
		short s1 = 10;
		short s2 = 20;
		// short b3 = b1 + b2;
		// short 끼리 연산하려면 캐스팅 해야함
		int s3 = (int) (s1 + s2);
		// int로 자동 변환 후 연산, Overflow 때문에
		int i1 = 1;
		int i2 = 2;
		int i3 = i1 + i2;

	}

}
