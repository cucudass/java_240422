package question05;

public class ReturnArray2 {
	public static void main(String[] args) {
		int[] arr = makeArray();
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+100+" ");
		}
	}
	
	public static int[] makeArray() {
		int[] temp = new int[10];
		for (int i = 0; i < temp.length; i++) {
			temp[i] = (i+1);
		}
		return temp;
	}
}
