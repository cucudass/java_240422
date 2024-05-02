package chapter03;

/*
 * 구구단을 배열로 생성
 * 값을 넣어본다.
 * */
public class Ex3_9 {
	public static void main(String[] args) {
		int[][] gugudan = new int[10][10];//10행 10열 0~9까지
		
		for (int i = 1; i < 10; i++) { //행 기중
			for (int j = 1; j < 10; j++) {// 열 기준
				//1*1 ~ 9*9까지
				gugudan[i][j] = i * j;
			}
		}
		
		System.out.println("2 X 7 = " + gugudan[2][7]);
	}
}
