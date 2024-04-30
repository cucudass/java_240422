package question02;

import java.util.Scanner;

public class ExStock {
	public static void main(String[] args) {
		int cospi = 0, ch = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("코스피 지수를 입력하세요(1800~2500): ");
		cospi = sc.nextInt();
		System.out.print("환율을 입력하세요(1100~1200): ");
		ch = sc.nextInt();
		
		if(cospi >= 2000) {
			if(ch >= 1150) {
				if(cospi >= 2200)
					System.out.println("상승장");
				else
					System.out.println("횡보장");
			} else if(ch < 1150) {
				if(cospi >= 2300)
					System.out.println("상승장");
				else
					System.out.println("횡보장");
			}
		} else {
			System.out.println("하락장");
		}
		sc.close();
	}
}
