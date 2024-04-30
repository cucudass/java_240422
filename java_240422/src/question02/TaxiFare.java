package question02;

import java.util.Scanner;

public class TaxiFare {
	public static void main(String[] args) {
		int fare = 0, income = 0;
		
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < 10; i++) {
			System.out.print("요금을 입력하세요: ");
			fare = sc.nextInt();
			income += fare;
		}
		sc.close();
		System.out.println("총 수입: " + income);
	}
}
