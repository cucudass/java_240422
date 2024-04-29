package chapter02;

import java.util.Scanner;

//임금 계산
public class Pay {
	public static void main(String[] args) {
		final int RATE = 10000;//1시간 임금
		int hour;//시간
		int pay;
		
		System.out.println("시간을 입력하시오: ");
		Scanner sc = new Scanner(System.in);
		hour = sc.nextInt();
		
		//8시간 이하 => 임금 * 시간
		//8시간 초과 => 임금 * 시간 * 1.5
		if (hour > 8) {
			pay = (int)(RATE * 8 + (RATE * (hour - 8) * 1.5));
		} else {
			pay = hour * RATE;
		}
		
		System.out.println("급여는 " + pay + "입니다.");
		sc.close();
	}
}
