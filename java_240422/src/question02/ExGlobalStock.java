package question02;

import java.util.Scanner;

public class ExGlobalStock {
	public static void main(String[] args) {
		int num1 = 0, num2 = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("매수금액을 입력하세요: ");
		num1 = sc.nextInt();
		System.out.print("매도금액을 입력하세요: ");
		num2 = sc.nextInt();
		
		double tax = 0;
		if(num1 < num2)
			tax = (num2 - num1) * 0.22;
		
		sc.close();
		System.out.println("양도세 = " + tax);
	}
}
