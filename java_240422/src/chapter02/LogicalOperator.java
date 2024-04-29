package chapter02;

public class LogicalOperator {
	public static void main(String[] args) {
		//문자끼리 비교는 유니코드 크기로 비교
		System.out.println('a' > 'b');
		System.out.println('a' < 'b');
		
		System.out.println(-1 < 0);
		System.out.println(3 >= 2);
		System.out.println("===================================");
		System.out.println(3.45 <= 2);
		System.out.println(3 == -2);
		System.out.println(3 != -2);
		System.out.println(!(3 != -2));
		System.out.println("===================================");
		//true && false = false;
		System.out.println((3 > 2) && (3 > 4));
		//true || false = true;
		System.out.println((3 != 2) || (-1 > 0));
		//ture ^ false = false;
		System.out.println((3 != 2) ^ (-1 > 0));
	}
}
