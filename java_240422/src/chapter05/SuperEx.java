package chapter05;

/*
 * super() 사용
 * */
class Point2 {
	private int x, y;//4
	public Point2() {//2
		this.x = this.y = 0;//3
	}
	public Point2(int x, int y) {// b(5,6)
		//c 멤버 저장
		this.x = x;
		this.y = y;
	}
	public void showPoint() {
		System.out.println("(" + x + ", " + y + ")");
	}
}

class ColorPoint2 extends Point2 {
	private String color;

	public ColorPoint2(int x, int y, String color) {//1 (5, 6, "blue")
		super(x, y);// a. 5, 6
		this.color = color;//5 "blue"
	}
	public void showColorPoint() {
		System.out.println(color);
		showPoint();
	}
}
public class SuperEx {
	public static void main(String[] args) {
		//객체 생성 (0,0), blue 객체
		ColorPoint2 cp = new ColorPoint2(5, 6, "blue");
		cp.showColorPoint();
	}
}
