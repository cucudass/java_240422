package package11;

public class A {
	A a1 = new A(true);
	A a2 = new A(1);
	A a3 = new A("문자열");
	
//	생성자
	public A(boolean b) {
	}
//	오버로딩
	A(int b) { //defalut 접근 지정자
	}
//	private A(String b) { //private 접근 지정자
//	}
//	A(String b) {
//	}
	public A(String b) {
	}
}
