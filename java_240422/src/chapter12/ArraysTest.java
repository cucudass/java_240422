package chapter12;

import java.util.Arrays;

public class ArraysTest {
	public static void main(String[] args) {
		int[] array = {9,4,5,6,2,1};
		
		printArray(array);
		System.out.println();
		Arrays.sort(array);
		printArray(array);
		System.out.println();
		System.out.println(Arrays.binarySearch(array, 9)); //9의 인덱스 번지 반환
		System.out.println(Arrays.binarySearch(array, -1)); //없는 값은 음수 반환
		System.out.println(Arrays.binarySearch(array, 0)); 
		System.out.println(Arrays.binarySearch(array, 3));
		
		Arrays.fill(array, 8); //배열을 특정한 값으로 채운다.
		printArray(array);
	}
	//배열을 매개변수로 받아서 출력하는 메소드
	private static void printArray(int[] array) {
		System.out.print("[");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.print("]");
	}
}
