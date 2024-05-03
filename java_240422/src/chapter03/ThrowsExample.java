package chapter03;

public class ThrowsExample {
	public static void main(String[] args) {
		try {
			findClass();
			System.out.println("클래스를 찾음!!!");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
//			e.printStackTrace();
			System.out.println("클래스를 못 찾음 ㅠ.ㅠ");
		}
	}
	//throws: 메소드를 호출한 곳으로 예외처리를 넘김
	public static void findClass() throws ClassNotFoundException {
//		Class.forName("java.lang.String");
		Class.forName("java.lang.String2");
		/*
		try {
			//forName: 패키지에서 클래스를 찾음
//			Class.forName("java.lang.String");
			Class.forName("java.lang.String2");
			System.out.println("클래스를 찾음");
		} catch (ClassNotFoundException e) {
			//예외 발생 시 출력되는 기본 메세지
			e.printStackTrace();
		}
		*/
	}
}
