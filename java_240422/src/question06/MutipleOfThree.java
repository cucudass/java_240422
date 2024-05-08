package question06;

import java.util.Scanner;

public class MutipleOfThree {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = "";
		int[] arr = new int[10];
		
		System.out.print("양의 정수 10개를 입력하시오>>");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
			if(arr[i] % 3 == 0)
				str += arr[i] + " ";
		}
		System.out.println("3의 배수는 " + str);
		sc.close();
	}
}
