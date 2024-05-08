package chapter04;

class Circle3{
//	멤버 저장됨
	int radius;
	
	public double getArea() {
		return 3.14 * radius * radius;
	}
	public Circle3(int radius) {
//		매개변수를 멤버에 저장
		this.radius = radius;
	}
}
public class CircleArray {
	public static void main(String[] args) {
//		객체배열 선언
		Circle3[] c;
		c = new Circle3[5]; //객체배열 생성
		
		for (int i = 0; i < c.length; i++) {
			c[i] = new Circle3(i);//c[0] ~ c[4] 참조변수 객체
		}
				
		for (int i = 0; i < c.length; i++) {
			System.out.print((int)c[i].getArea() + " "); //각각의 원 넓이를 구함
		}
	}
}
