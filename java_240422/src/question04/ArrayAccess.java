package question04;

import java.util.Scanner;

public class ArrayAccess {
	public static void main(String[] args) {
		int[] arr = new int[5];
		int num = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("양수 5개를 입력하세요");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
			
			if(arr[i] > num)
				num = arr[i];
		}

		sc.close();
		System.out.println("가장 큰 수는 " + num + "입니다.");
	}
}
