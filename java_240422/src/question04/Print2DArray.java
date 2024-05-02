package question04;

public class Print2DArray {
	public static void main(String[] args) {
		//열의 크기가 각각 다른 비정방향 배열
		int n [][] = { {1}, {1,2,3}, {1}, {1,2,3,4}, {1,2}};
		//n.length -> 5(행의 크기)
		for (int i = 0; i < n.length; i++) {
			for (int j = 0; j < n[i].length; j++) {
				System.out.print(n[i][j]+" ");
			}
			System.out.println();
		}
	}
}
