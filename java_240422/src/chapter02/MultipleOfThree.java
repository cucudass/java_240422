package chapter02;

import java.util.Scanner;

//3의 배수 여부
public class MultipleOfThree {
	public static void main(String[] args) {
		System.out.print("수를 입력하시오: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if (n % 3 == 0) {
			System.out.println("3의 배수입니다.");
		} else {
			System.out.println("3의 배수가 아닙니다.");
		}
		sc.close();
	}
}