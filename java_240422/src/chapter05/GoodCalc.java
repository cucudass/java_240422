package chapter05;

abstract class Calculator { //추상클래스 선언(추상메소드 없어도 됨)
//	public int add(int a, int b) {
//		return 1;
//	}
	public abstract int add(int a, int b); //추상클래스 선언
	public abstract int subtract(int a, int b); //추상클래스 선언
	public abstract double average(int[] a); //추상클래스 선언
}

//public abstract class GoodCalc extends Calculator {//추상메소드 구현 불필요
public class GoodCalc extends Calculator { //추상메소드 오버라이딩해서 구현 필요
	@Override
	public int add(int a, int b) {
		return a + b;
	}

	@Override
	public int subtract(int a, int b) {
		return a - b;
	}

	@Override
	public double average(int[] a) {
		double sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum += a[i];
		}
		return sum/a.length;
	}
	public static void main(String[] args) {
		GoodCalc c = new GoodCalc(); //추상 클래스는 객체 생성 불가
		System.out.println(c.add(2, 3));
		System.out.println(c.subtract(2, 3));
		System.out.println(c.average(new int[] {2, 3, 4}));
	}
}
