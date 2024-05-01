package question02;

import java.util.Scanner;

public class ArithmeticOperator {
	public static void main(String[] args) {
		int num = 0, hour = 0, min = 0, sec = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하세요: ");
		num = sc.nextInt();
		
		hour = num / 3600;
		min = (num % 3600) / 60;
		sec = (num % 3600) % 60;
		sc.close();
		System.out.println(num+"초는 " + hour + "시간, " + min + "분, " + sec + "초입니다.");
	}
}
