package chapter03;

/*
 * main 메소드 매개변수 이용
 * */
public class Calc {
	public static void main(String[] args) {
		double sum = 0.0;
		
		for (int i = 0; i < args.length; i++) {
			//Double: Wapprer 클래스
			sum += Double.parseDouble(args[i]);
		}
		System.out.println("합계: " + sum);
	}
}
