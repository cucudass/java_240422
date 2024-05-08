package question06;

import java.util.Scanner;

public class ArrayMinMax {
	public static void main(String[] args) {
		int[] arr = new int[10];
		Scanner sc = new Scanner(System.in);
		int min = 0, max = 0;
		System.out.println("양수 10개를 입력하세요");
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
			
			if(i == 0) min = arr[i];
			
			min = Integer.min(min, arr[i]);
			max = Integer.max(max, arr[i]);
		}
		sc.close();
		System.out.println("가장 작은 수는 " + min + "이고, 가장 큰수는 " + max +"이고, 최소값+최대값은 " + (min + max) + "입니다. ");
	}

}
