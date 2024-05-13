package chapter06;

class Point3 {
	private int x, y;

	public Point3(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	@Override
	public boolean equals(Object obj) {
		Point3 p = (Point3)obj;
		if(x == p.x && y == p.y) {
			return true;
		} else {
			return false;
		}
	}

}
public class EqualsEx {
	public static void main(String[] args) {
		Point3 a = new Point3(2, 3);
		Point3 b = new Point3(2, 3);
		Point3 c = new Point3(2, 3);
		
		if(a==b) {
			System.out.println("a == b");
		} else {
			System.out.println("a != b");
		}
		
		if(a.equals(b)) {//a is equals to b
			System.out.println("a is equals to b");
		} else {
			System.out.println("a is equals not to b");
		}
		
		if(a.equals(c)) { //a is equals not to c
			System.out.println("a is equals to c");
		} else {
			System.out.println("a is equals not to c");
		}
	}
}
