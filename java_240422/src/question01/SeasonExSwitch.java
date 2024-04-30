package question01;

import java.util.Scanner;

public class SeasonExSwitch {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("달을 입력하세요(1~12)>>");
		int a = sc.nextInt();
		String s = "";
		switch (a) {
		case 12:
		case 1:
		case 2:
			s = "겨울";
			break;
		case 3:
		case 4:
		case 5:
			s = "봄";
			break;
		case 6:
		case 7:
		case 8:
			s = "여름";
			break;
		case 9:
		case 10:
		case 11:
			s = "가을";
			break;
		default:
			s = "잘못입력";
			break;
		}
		System.out.println(s);
	}
}
