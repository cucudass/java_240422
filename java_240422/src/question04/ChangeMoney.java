package question04;

import java.util.Scanner;

public class ChangeMoney {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("금액을 입력하시오>>");
		int money = sc.nextInt();
		
		int cnt = money / 50000;
		if(cnt > 0) 
			System.out.println("오만원권 " + cnt + "매");
		
		money %= 50000;
		cnt = money / 10000;
		if(cnt > 0)
			System.out.println("만원권 " + cnt + "매");
		
		money %= 10000;
		cnt = money / 1000;
		if(cnt > 0)
			System.out.println("천원권 " + cnt + "매");
		
		money %= 1000;
		cnt = money / 500;
		if(cnt > 0)
			System.out.println("오백원 " + cnt + "개");
		
		money %= 500;
		cnt = money / 100;
		if(cnt > 0)
			System.out.println("백원 " + cnt + "개");
		
		money %= 100;
		cnt = money / 50;
		if(cnt > 0)
			System.out.println("오십원 " + cnt + "개");
		
		money %= 50;
		cnt = money / 10;
		if(cnt > 0)
			System.out.println("십원 " + cnt + "개");
		
		money %= 10;
		cnt = money / 1;
		if(cnt > 0)
			System.out.println("일원 " + cnt + "개");
			
		sc.close();
		
	}
}
