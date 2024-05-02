package chapter03;

/*
 * 배열 리턴(메소드 이용)
 * */
public class ReturnArray {
	static int[] makeArray() {
		int[] temp = new int[4];
		
		for (int i = 0; i < temp.length; i++) {
			temp[i] = i;
		}
		
		return temp;
	}
	public static void main(String[] args) {
		int[] intArray;
		intArray = makeArray();//메소드 호출
		
		for (int i = 0; i < intArray.length; i++) {
			System.out.print(intArray[i] + " ");
		}
	}
}
