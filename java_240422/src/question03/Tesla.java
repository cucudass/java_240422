package question03;

import java.util.Scanner;

public class Tesla {
	public static void main(String[] args) {
		int t = 520;
		int c = 0;
		int cnt = 0;
		
		int h = 0, te = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("매수 수량을 입력하시오>>");
		c = sc.nextInt();
		
		cnt = t * c;
		
		h = cnt / 100;
		te = (cnt % 100) / 10;
		
		if(h > 0)
			System.out.println("100달러짜리 " + h + "매");
		if(te > 0)
			System.out.println("10달러짜리 " + te + "매");
		
		sc.close();
	}
}
