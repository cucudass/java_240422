package chapter02;

public class CastingExample {
	public static void main(String[] args) {
		int intValue = 44032;
//		char charValue = intValue; int 타입을 char로 바로 저장할려고 하면 오류
		//char로 변환
		char charValue = (char) intValue;
		System.out.println(charValue);
		
		//정수 작은 타입에서 큰 타입으로 변환(자동변환->묵시적변환)
		//long longValue = 500;
		long longValue = 5009999888L;
		//정수 큰 타입에서 작은 타입으로 변환(변환 안하면 오류)
		intValue = (int) longValue;
		//변환시 짤려서 715032592로 저장됨
		System.out.println(intValue);
		
		double doubleValue = 3.14;
		intValue = (int) doubleValue;
		//소수점 짤려서 3으로 저장
		System.out.println(intValue);
	}
}
