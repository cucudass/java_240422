package question07;

public class ArrayParameterEx {
	static void printStringArray(String[] str) {
		for (int i = 0; i < str.length; i++) {
			System.out.print(str[i]);
		}
		System.out.println();
	}
	
	static void relpaceBe(String[] str) {
		for (int i = 0; i < str.length; i++) {
			if(str[i].equals("be"))
				str[i] = "eat";
		}
	}
	
	public static void main(String[] args) {
		String[] str = {"to", " ", "be", " ", "or", " ", "not", " ", "to", " ", "be"};
		
		printStringArray(str);
		relpaceBe(str);
		printStringArray(str);
	}
}
