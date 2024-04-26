package chapter02;

public class CircleArea {
	public static void main(String[] args) {
		double pi = 3.14;
		int radius = 10;
		
		//연산 시 큰 타입을 따라감
		double circleArea = pi * radius * radius;
		System.out.println(circleArea);
	}
}
