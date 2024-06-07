package question09;

import java.util.Scanner;

abstract class Calc {
	protected int a, b;
	
	public void setValue(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	public abstract int calculate();
}

class Add extends Calc {	
	@Override
	public int calculate() {
		return a + b;
	}
}

class Sub extends Calc {
	@Override
	public int calculate() {
		return a - b;
	}
}

class Mul extends Calc {
	@Override
	public int calculate() {
		return a * b;
	}
}

class Div extends Calc {
	@Override
	public int calculate() {
		return a / b;
	}
}

public class Calculator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1 = 0, n2 = 0;
		String str = "";
		System.out.print("두 정수와 연산자를 입력하시오>>");
		
		n1 = sc.nextInt();
		n2 = sc.nextInt();
		str = sc.next();
		
		Calc exp = null;
		switch (str) {
		case "+":
			exp = new Add();
			break;
		case "-":
			exp = new Sub();
			break;
		case "*":
			exp = new Mul();
			break;
		case "/":
			exp = new Div();
			break;
		}
		exp.setValue(n1, n2);
		if(exp instanceof Div && n2 == 0)
			System.out.println("계산할 수 없습니다.");
		else
			System.out.println(exp.calculate());
		sc.close();
	}
}
