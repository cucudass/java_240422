package question07;

import java.util.Random;

public class TwoDArray {
	public static void main(String[] args) {
		Random r = new Random();
		int[][] arr = new int[4][4];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = r.nextInt(10) + 1;
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
	}
}
