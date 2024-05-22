package question08;

import java.util.Random;
import java.util.Scanner;

public class RandomArray {
	public static void main(String[] args) {
		int num = 0;
		Random r = new Random();
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 몇개?");
		num = sc.nextInt();
		int[] arr = new int[num];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = r.nextInt(100) + 1;
			System.out.print(arr[i] + " ");
			if((i + 1) % 10 == 0)
				System.out.println();
		}
		sc.close();
	}
}
