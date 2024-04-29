package chapter02;


//1.public class 찾아감
public class Square {
	//viod 반환 값이 없다.
	//2.main 메소드 찾아감
	public static void main(String[] args) {
		int n = 4;
		//3. 메소드 호출
		int s = square(n); //메소드 호출부
		System.out.println("한변의 길이가 " + n + "인 정사각형의 넓이: " + s);
	}
	
	//public static void square(int n) { //메소드 정의부
//	int: 리턴 타입
	//4.메소드 호출됨
	public static int square(int length) {
//		return ;
//		return ""; 타입 불일치시 오류(String)
//		return 0; 타입 불일치시 오류(int)
//		5. length를 제곱해서 반환
		return length * length;
	}
}
