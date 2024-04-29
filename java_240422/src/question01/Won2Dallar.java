package question01;

import java.util.Scanner;

public class Won2Dallar {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		final double RATE = 1100;
		System.out.print("원화를 입력하세요(단위 원)>>");
		int i = sc.nextInt();
		System.out.println(i + "원은 $" + (double)(i / RATE) + "입니다.");
		sc.close();
	}
}
