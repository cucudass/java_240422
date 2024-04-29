package question01;

import java.util.Scanner;

public class DivAndRemains {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("2자리수 정수 입력(10~99)>>");
		int num = sc.nextInt();
		if(num % 11 == 0)
			System.out.println("Yes! 10의 자리와 1의 자리가 같습니다.");
		else
			System.out.println("No! 10의 자리와 1의 자리가 다릅니다..");
		sc.close();
	}
}
