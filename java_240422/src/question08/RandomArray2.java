package question08;

import java.util.Random;
import java.util.Scanner;

public class RandomArray2 {
	static boolean check2(int[] arr, int ran, int n) {
		for(int j = 0; j < ran; j++) {
			if(arr[j] == n) {
				return true;
			}
		}
		return false;
	}
	
	public static void main(String[] args) {
		int num = 0, rn = 0;
		Random r = new Random();
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 몇개?");
		num = sc.nextInt();
		int[] arr = new int[num];
		
		for (int i = 0; i < arr.length; i++) {
			rn = r.nextInt(100) + 1;
			
			if(check2(arr, i, rn)) {
				i--;
				continue;
			}
			arr[i] = rn;
			System.out.print(arr[i] + " ");
			if((i + 1) % 10 == 0)
				System.out.println();
		}
		sc.close();
	}	
}
