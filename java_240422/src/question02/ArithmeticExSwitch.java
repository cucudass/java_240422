package question02;

import java.util.Scanner;

public class ArithmeticExSwitch {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("연산>>");
		int a = sc.nextInt();
		String str = sc.next();
		int b = sc.nextInt();
		
		int num = 0;
		boolean flag = true;
		
		switch (str) {
		case "+":
			num = a + b;
			break;
		case "-":
			num = a - b;
			break;
		case "*":
			num = a * b;
			break;
		case "/":
			if(b != 0)
				num = a / b;
			else { 
				System.out.println("0으로 나눌수 없습니다.");
				flag = false;
			}
			break;
		default:
			System.out.println("사칙연산 기호가 아닙니다.");
			flag = false;
			break;
		}
		if(flag)
			System.out.println(a+str+b+"의 계산 결과는 " + num);
		sc.close();
	}
}
