package question08;

import java.util.Scanner;

class Add  {
	private int a;
	private int b;
	
	public void setValue(int a, int b) {
		this.a = a;
		this.b = b;
	}
	public int calculate() {
		return a + b;
	}
}
class Sub {
	private int a;
	private int b;
	
	public void setValue(int a, int b) {
		this.a = a;
		this.b = b;
	}
	public int calculate() {
		return a - b;
	}
	
}
class Mul {
	private int a;
	private int b;
	
	public void setValue(int a, int b) {
		this.a = a;
		this.b = b;
	}
	public int calculate() {
		return a * b;
	}
}
class Div {
	private int a;
	private int b;
	
	public void setValue(int a, int b) {
		this.a = a;
		this.b = b;
	}
	public int calculate() {
		int res = 0;
		try {
			res = a / b;
		} catch (Exception e) {
			System.out.println("0으로 나눌 수 없습니다.");
			return 0;
		}
		return res;
	}
}

public class Calc {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1 = 0, n2 = 0;
		String str = "";
		System.out.print("두 정수와 연잔사를 입력하시오>>");
		
		n1 = sc.nextInt();
		n2 = sc.nextInt();
		str = sc.next();
		
		switch (str) {
		case "+":
			Add add = new Add();
			add.setValue(n1, n2);
			System.out.println(add.calculate());
			break;
		case "-":
			Sub sub = new Sub();
			sub.setValue(n1, n2);
			System.out.println(sub.calculate());
			break;
		case "*":
			Mul mul = new Mul();
			mul.setValue(n1, n2);
			System.out.println(mul.calculate());
			break;
		case "/":
			Div div = new Div();
			div.setValue(n1, n2);
			System.out.println(div.calculate());
			break;
		}
		sc.close();
	}
}
