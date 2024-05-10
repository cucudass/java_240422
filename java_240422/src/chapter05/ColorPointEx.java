package chapter05;

/*
 * Point 클래스: (x,y) 한점을 표현
 * Point 클래스를 상속 받는 ColorPointEx 클래스 
 * */
class Point {
	private int x, y;

	public void set(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public void showPoint() {
		System.out.println("(" + x + ", " + y + ")");
	}
	
	public int getX() { return x; }
	public int getY() { return y; }

}

class ColorPoint extends Point {
	private String color;
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public void showColor() {
		System.out.println(color);
		showPoint();
	}
}
public class ColorPointEx {
	public static void main(String[] args) {
		Point p = new Point(); //객체 생성, 멤버 4개, 기본 생성자 호출
		p.set(1, 2);
		p.showPoint();
		System.out.println();
		//객체 생성, 멤버 7개, 생성자 호출(기본): Point() -> ColorPoint()
		ColorPoint cp = new ColorPoint();
		cp.set(3, 4);
		cp.showPoint();
		cp.setColor("red");
		cp.showColor();
	}
}
