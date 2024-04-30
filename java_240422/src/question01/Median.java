package question01;

import java.util.Scanner;

public class Median {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 3개 입력>>");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int num = 0;
		
		if((a < b && a > c) || (a > b && a < c)) {
			num = a;
		} else if((b < a && b > c) || (b > a && b < c)) {
			num = b;
		} else if((c < b && c > a) || (c > b && c < a)) {
			num = c;
		}
		sc.close();
		System.out.println("중간 값은 " + num);
	}
}
