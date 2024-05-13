package question07;

import java.util.Scanner;

public class ChangeMoney {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int [] unit = {50000, 10000, 1000, 500, 100, 50, 10, 1};
		int money = 0, cnt = 0;
		System.out.print("금액을 입력하시오>>");
		money = sc.nextInt();
		for (int i = 0; i < unit.length; i++) {
			cnt = money / unit[i];
			if(cnt > 0)
				System.out.println(unit[i]+"원 짜리 : " + cnt + "개");
			money %= unit[i];
		}
		sc.close();
	}
}
