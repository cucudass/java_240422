package chapter02;

public class Copy {
	public static void main(String[] args) {
//		타입  변수명
//		String origin;
		String origin = "가나다라";
		String copy = origin;
		System.out.println(origin);
		System.out.println(copy);
		
		copy = copy + "마바사";
		System.out.println(copy);
	}
}
