package chapter02;

public class AssignmentIncDecOperator {
	public static void main(String[] args) {
		int a = 3, b = 3, c = 3;
		
//		a = a + 3;
		a += 3;
		b *= 3;
		c %= 2;
		System.out.println("a = " + a + ", b = " + b + ", c = " + c);
		
		int d = 3; //a=6, d=3
		a=d++; //a=3, d=4 후위 연산자
		System.out.println("a = " + a + ", d = " + d);
		
		a = ++d; //a=5, d=5 전위 연산자
		System.out.println("a = " + a + ", d = " + d);
		
		a = d--; //a=5, d=4 후위 연산자
		System.out.println("a = " + a + ", d = " + d);
		
		a = --d; //a=3, d=3 후위 연산자
		System.out.println("a = " + a + ", d = " + d);
	}
}
