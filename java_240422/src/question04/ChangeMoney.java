package question04;

import java.util.Scanner;

public class ChangeMoney {
	public static void main(String[] args) {
		int[] marr = {50000,10000,1000,500,100,50,10,1};
		String[][] mstr = {{"오만원권","매"},{"만원권","매"},{"천원권","매"},{"오백원","개"},{"백원","개"},{"오십원","개"},{"십원","개"},{"일원","개"}};
		Scanner sc = new Scanner(System.in);
		
		System.out.print("금액을 입력하시오>>");
		int money = sc.nextInt();
		int cnt = 0;
		for(int i = 0; i < marr.length; i++) {
		    cnt = money / marr[i];
		    if(cnt > 0)
		    	System.out.println(mstr[i][0] + " "+ cnt + mstr[i][1]);
		    money %= marr[i];
		}
		sc.close();
	}
}