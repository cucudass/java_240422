package chapter03;

import java.util.Scanner;

/*
 * 나눗셈
 * 몫을 출력(분모가 0인 경우 불능)
 * */

public class DivideByZero {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int dividend, divisor;
		
		System.out.print("분자를 입력하시오: ");
		dividend = sc.nextInt();
		System.out.print("분모를 입력하시오: ");
		divisor = sc.nextInt();
		
		System.out.println(dividend + "를 " + divisor + "로 나누면 몫은 " + dividend / divisor + "입니다.");
		
		sc.close();
	}
}
