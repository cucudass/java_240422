package chapter02;

public class PromotionExample {
	public static void main(String[] args) {
		byte byteValue = 10;
//		byte byteValue = 100;		
		//작은 타입에서 큰 타입으로 자동변환
		int intValue = byteValue;
		System.out.println("intValue: "+intValue);
		
		char charValue = '가';
		//유니코드 저장
		intValue = charValue;
		System.out.println("intValue: "+intValue);
		
		intValue = 50;
		//작은 타입에서 큰 타입으로 자동변환
		long longValue = intValue;
		System.out.println("longValue: "+longValue);
		
		longValue = 100;
		//정수를 실수로 받음
		float floatValue = longValue;
		System.out.println("floatValue: "+floatValue);
		
		floatValue = 100.5f;
		double doubleValue = floatValue;
		System.out.println("doubleValue: "+doubleValue);
	}
}
