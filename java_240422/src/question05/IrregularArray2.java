package question05;

public class IrregularArray2 {
	public static void main(String[] args) {
		int[][] arr2 = new int[5][];
		int[] arr1 = {5,1,4,2,3};
		
		for (int i = 0; i < arr2.length; i++) {
			arr2[i] = new int[arr1[i]];
			for (int j = 0; j < arr2[i].length; j++) {
				arr2[i][j] = (i + 3) * 10 + j + 5;
				
				System.out.print(arr2[i][j] + " ");
			}
			System.out.println();
		}
	}
}
