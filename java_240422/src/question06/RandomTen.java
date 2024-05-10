package question06;

import java.util.Random;

public class RandomTen {
	public static void main(String[] args) {
		int[] arr = new int[10];
		Random r = new Random();
		int cnt = 0;
		double sum = 0;
		System.out.print("랜덤한 정수들: ");
		while(cnt < 10) {
			arr[cnt] = r.nextInt(10) + 1;
			System.out.print(arr[cnt] + " ");
			sum += arr[cnt++];
		}
		System.out.println("\n평균은 " + sum/10);	
	}
}
