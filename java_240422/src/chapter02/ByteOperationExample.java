package chapter02;

public class ByteOperationExample {
	public static void main(String[] args) {
		byte result1 = 10 + 20; //연산식을 변수로 저장
		System.out.println(result1);
		
		byte x = 10, y = 10;
		//연산되어서 int로 자동 변환되어 바이트로 캐스팅해야됨
//		byte result2 = x + y;
		byte result2 = (byte) (x + y);
		System.out.println(result1);
	}
}
