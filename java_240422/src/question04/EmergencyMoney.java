package question04;

import java.util.Scanner;

public class EmergencyMoney {
	public static void main(String[] args) {
		int family = 0, hun = 0, ten = 0;
		int money = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("가구수를 입력하세요>>");
		family = sc.nextInt();
		
		switch (family) {
		case 1: 
			money = 400000 / 1200;
			break;
		case 2: 
			money = 600000 / 1200;
			break;
		case 3: 
			money = 800000 / 1200;
			break;
		default : 
			money = 1000000 / 1200;
			break;
		}
		
		hun = money / 100;
		ten = (money % 100) / 10;
		
		if(hun > 0)
			System.out.println("100달러짜리 " + hun + "매");
		if(ten > 0)
			System.out.println("10달러짜리 " + ten + "매");
		sc.close();
	}
}
