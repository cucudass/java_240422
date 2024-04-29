package question01;

import java.util.Scanner;

public class ExSumMultiply {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("3자리수 정수 입력(100~999)>>");
		int num = sc.nextInt();
		
		int a = num / 100;
		int b = (num % 100) / 10;
		int c = num % 10;
		System.out.println("100의 자리와 10의 자리의 합은 " + (a + b));
		System.out.println("10의 자리와 1의 자리의 곱은 " + (b * c));
		sc.close();
	}
}
