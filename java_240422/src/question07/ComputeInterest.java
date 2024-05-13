package question07;

import java.util.Scanner;

public class ComputeInterest {
	public static void main(String[] args) {
		int principal = 0, years = 0;
		double rate = 0.0d, balance = 0.0d;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("원금을 입력하세요: ");
		principal = sc.nextInt();
		System.out.print("연이율을 입력하세요: ");
		rate = sc.nextDouble();
		
		System.out.println("연도수\t원리금");
		balance = principal;
		while(balance < (principal * 2)) {
			balance *= (1.0 + rate / 100.0);
			System.out.println(++years+"\t"+balance);
		}
		System.out.println("필요한 연도수 = " + years);
		sc.close();
	}
}
