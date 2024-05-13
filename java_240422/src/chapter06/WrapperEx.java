package chapter06;

public class WrapperEx {
	public static void main(String[] args) {
		char c1 = '4', c2 = 'F';
		
		//Character: Wrapper 클래스
		if(Character.isDigit(c1)) { //숫자 체크
			System.out.println("숫자");
		} else {
			System.out.println("숫자 아님");
		}
		
		if(Character.isDigit(c2)) { //숫자 체크
			System.out.println("숫자");
		} else {
			System.out.println("숫자 아님");
		}
		
		if(Character.isAlphabetic(c2)) { //알파벳 체크
			System.out.println("알파벳");
		} else {
			System.out.println("알파멧 아님");
		}
		if(Character.isAlphabetic(c1)) { //알파벳 체크
			System.out.println("알파벳");
		} else {
			System.out.println("알파멧 아님");
		}
		
		System.out.println(Integer.parseInt("-123"));
		System.out.println(Integer.toHexString(28));//16진수 1c 출력
		System.out.println(Integer.toBinaryString(28));//2진수 11100 출력
		System.out.println(Integer.bitCount(28));//2진수에서 1의 갯수
		
		Double d = Double.valueOf(3.14);//3.14를 포함하는 개체를 가리키는 d 참조변수
		System.out.println(d.toString());//문자열3.14를 출력
		System.out.println(Double.parseDouble("3.14"));//실수 3.14를 출력
		
		boolean b = 4>3;
		System.out.println(Boolean.toString(b)); //문자열 true 출력
		System.out.println(Boolean.parseBoolean("false")); //bool타입 fasle 출력
		
	}
}

