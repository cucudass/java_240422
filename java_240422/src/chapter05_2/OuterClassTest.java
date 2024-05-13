package chapter05_2;

class OuterClass { //외부 클래스
	private String secret = "Time is money";
//	public String secret = "Time is money";
	
	public OuterClass() {
//		new InnerClass();
		InnerClass obj = new InnerClass();
		obj.method();
	}
	
	public class InnerClass { //내부 클래스
//	private class InnerClass { //내부 클래스
		public InnerClass() {
			System.out.println("내부 클래스의 생성자");
		}
		public void method() {
			System.out.println(secret);
		}
	}
}

public class OuterClassTest {
	public static void main(String[] args) {
//		new OuterClass();
		OuterClass outer =  new OuterClass();
//		outer.secret = "";
//		private가 아닌 경우에도 접근 불가
//		new InnerClass(); //접근 제한
		
	}
}
