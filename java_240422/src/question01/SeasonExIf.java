package question01;

import java.util.Scanner;

public class SeasonExIf {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("달을 입력하세요(1~12)>>");
		int a = sc.nextInt();
		String s = "";
		if(a >= 3 && a <= 5)
			s = "봄";
		else if (a >= 6 && a <= 8)
			s = "여름";
		else if (a >= 9 && a <= 11)
			s = "가을";
		else if (a == 12 || a == 1 || a == 2)
			s = "겨을";
		else
			s = "잘못입력";
		
		System.out.println(s);
		sc.close();
	}
}
