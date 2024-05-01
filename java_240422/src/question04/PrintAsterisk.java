package question04;

import java.util.Scanner;

public class PrintAsterisk {
	public static void main(String[] args) {
		int num = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하시오>>");
		num = sc.nextInt();
		
		for (int i = 0; i < num; i++) { //for(int i = num; i > 0; i--) {
			for (int j = (num-i); j > 0; j--) { //for(int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		sc.close();
	}
}
