package question02;

import java.util.Scanner;

public class NestedIf {
	public static void main(String[] args) {
		int score = 0, rank = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("점수를 입력하세요(0~100): ");
		score = sc.nextInt();
		System.out.print("학년을 입력하세요(1~4): ");
		rank = sc.nextInt();
		
		if(rank == 4) {
			if(score >= 70)
				System.out.println("합격!");
			else 
				System.out.println("불합격!");
		} else {
			if(score >= 60)
				System.out.println("합격!");
			else 
				System.out.println("불합격!");
		}
		sc.close();
	}
}
