package question03;

import java.util.Scanner;

public class ThreeSixNine {
	public static void main(String[] args) {
		int count = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("10~99 사이의 정수를 입력하시오>>");
		int num = sc.nextInt();
		
		int ten = num / 10;
		int one = num % 10;
		
		if(ten % 3 == 0)
			count++;
		if(one != 0 && one % 3 == 0)
			count++;
		
		if(count == 1)
			System.out.print("박수짝");
		if(count == 2)
			System.out.println("박수짝짝");

		sc.close();
	}
}

