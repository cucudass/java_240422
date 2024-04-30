package question02;

import java.util.Scanner;

public class ArithmeticExIf {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("연산>>");
		int a = sc.nextInt();
		String s = sc.next();
		int b = sc.nextInt();

		int num = 0;
		boolean flag = true;
		
		if(s.equals("+"))
			num = a + b;
		else if(s.equals("-"))
			num = a - b;
		else if(s.equals("*"))
			num = a * b;
		else if(s.equals("/")) {
			if(b != 0)
				num = a / b;
			else { 
				System.out.println("0으로 나눌 수 없습니다.");
				//return; 프로그램 종료
				flag = false;
			}
		}
		if(flag)
			System.out.println(a + " " + s + " " + b + "의 계산 결과는 " + num);

		sc.close();
	}
}
