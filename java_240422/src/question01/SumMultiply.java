package question01;

import java.util.Scanner;

public class SumMultiply {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("2개의 정수 입력>>");
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println("두수의 합은 " + (a + b));
		System.out.println("두수의 곱은 " + a * b);
	}
}
