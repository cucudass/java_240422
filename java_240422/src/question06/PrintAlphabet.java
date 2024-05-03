package question06;

import java.util.Iterator;
import java.util.Scanner;

public class PrintAlphabet {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("소문자 알파벳 하나를 입력하시오 >>");
		String str = sc.next();
		
		char ch = str.charAt(0);
		int num = ch - 'a' + 1;
		
		char ch1 = 'a';		
		char[] arr = new char[num];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = ch1;
			ch1 += 1;
		}
		
		for (int i = 0; i < arr.length; i++) {
			int n = arr.length - i;
			for (int j = 0; j < n; j++) {
				System.out.print(arr[j]);
			}
			System.out.println();
		}
		
		sc.close();
	}
}
