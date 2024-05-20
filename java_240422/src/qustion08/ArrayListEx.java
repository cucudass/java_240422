package qustion08;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListEx {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		Scanner sc = new Scanner(System.in);
		String name = "";
		int longindex = 0;
		
		for (int i = 0; i < 4; i++) {
			System.out.print("이름을 입력하세요>>");
			name = sc.next();
			list.add(name);
			longindex = list.get(longindex).length() < list.get(i).length() ? i : longindex;
		}
		
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + " ");	
		}
		System.out.println("\n가장 긴 이름은 : " + list.get(longindex));
		sc.close();
	}
}
