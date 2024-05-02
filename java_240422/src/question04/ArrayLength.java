package question04;

import java.util.Scanner;

public class ArrayLength {
	public static void main(String[] args) {
		double avg = 0;
		int[] arr = new int[5];
		Scanner sc = new Scanner(System.in);
		System.out.print(arr.length + "개의 정수를 입력하세요>> ");
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
			
			avg += arr[i];
		}
		sc.close();
		System.out.println("평균은 " + avg / arr.length);
	}
}
