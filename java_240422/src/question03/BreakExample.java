package question03;

import java.util.Scanner;

public class BreakExample {
	public static void main(String[] args) {
		String str = "";
		Scanner sc = new Scanner(System.in);
		System.out.println("exit을 입력하면 종료합니다.");
		while(true) {
			System.out.print(">>");
			str = sc.next();
			if(str.equals("exit"))
				break;
		}
		sc.close();
		System.out.println("종료합니다...");
	}
}
