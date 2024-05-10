package question06;

import java.util.Random;

public class RandomNumber {
	public static void main(String[] args) {
		Random r = new Random();
		int rNumber = 0;
		while (true) {
			rNumber = r.nextInt(10) + 1;
			System.out.println(rNumber);
			if(rNumber == 7) {
				break;
			}
		}
		/*
		int rNumber = 0; 
	
		while (true) {
			rNumber = (int)(Math.random()*10) + 1;
			System.out.println(rNumber);
			if(rNumber == 7) {
				break;
			}
		}
		*/
	}
}
