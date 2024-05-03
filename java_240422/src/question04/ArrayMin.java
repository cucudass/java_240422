package question04;

import java.util.Scanner;

public class ArrayMin {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[7]; 
		int min = 0;  //Integer.MAX_VALUE; -> int형의 가장 큰 숫자
		System.out.println("양수 7개를 입력하세요.");
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
			if(i == 0)
				min = arr[i];
			min = min < arr[i] ? min : arr[i];
		}
		sc.close();
		System.out.println("가장 작은 수는 " + min + "입니다.");
	}
}
