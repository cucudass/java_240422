package chapter04;

import java.util.Scanner;

//접근지정자 default
class CurrencyConverter {
//	자기 클래스만 접근 가능
//	멤버 변수는 일반적으로 private 많이 사용(보안)
//	직접적인 값 수정 막음->메소드를 사용해서 접근
	private static double rate;
//	매개변수를 static(클래스)멤버로 저장, non-static(긱체)멤버
	public static void setRate(double rate) { CurrencyConverter.rate = rate; }
	
	public static double toDollar(double won) { 
		return won / rate;
	}
	public static double toKWR(double dollar) { 
		return dollar * rate;
	}
}

public class StaticMember {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("환율(1달러)>>");
		double rate = sc.nextDouble();
		
		CurrencyConverter.setRate(rate);
		System.out.println("백만원은 $"+CurrencyConverter.toDollar(1000000)+"입니다.");
		System.out.println("100$은 "+CurrencyConverter.toKWR(100)+"원 입니다.");
	}
}
