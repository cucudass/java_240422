package chapter02;

public class RandomNumber {
	public static void main(String[] args) {
		int n = rollDie();
		System.out.println("주사위의 눈: " + n);
	}
	
	public static int rollDie() {
		//0이상 ~ 1미만의 난수 발생(실수)
//		Math.random();
		//0이상 ~ 6미만의 난수 발생(실수)
		double x = 6 * Math.random();
		int temp = (int)x; //0 ~ 5
		
		return temp+1; // 1 ~ 6
	}
}
