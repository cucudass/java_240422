package question01;

import java.util.Scanner;

public class ExExchange {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		final double RATE1 = 1200;
		final double RATE2 = 1500;
		System.out.print("원화를 입력하세요(단위 원)>>");
		int i = sc.nextInt();
		System.out.println(i + "원은 $" + (i / RATE1) + "입니다.");
		System.out.println(i + "원은 E" + (i / RATE2) + "입니다.");
		sc.close();
	}
}
