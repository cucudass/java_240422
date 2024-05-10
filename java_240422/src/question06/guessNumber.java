package question06;

import java.util.Random;
import java.util.Scanner;

public class guessNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		
		int numberToGuess = r.nextInt(10) + 1;
		int guess = 0;
		
		while(true) {
			System.out.print("추측한 숫자를 입력하세요: ");
			guess = sc.nextInt();
			
			if(numberToGuess == guess) {
				System.out.println("맞추셨습니다.");
				break;
			} else{
				System.out.println("추측한 숫자가 틀렸습니다.");
				if(numberToGuess > guess)
					System.out.println("추측한 숫자가 너무 작습니다.");
				else
					System.out.println("추측한 숫자가 너무 큽니다.");
			}
		}
		sc.close();
	}
}
