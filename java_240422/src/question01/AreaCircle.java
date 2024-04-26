package question01;

import java.util.Scanner;

public class AreaCircle {
	public static void main(String[] args) {
		double pi = 3.14;
		Scanner sc = new Scanner(System.in);
		System.out.print("반지름을 입력하세요>> ");
		int r = sc.nextInt();
		sc.close();
		System.out.println("원의 면적은 " + pi*r*r + "입니다.");
		
	}
}
