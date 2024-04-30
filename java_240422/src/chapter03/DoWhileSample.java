package chapter03;

/*
 * a ~ z의 알파벳 출력
 * */
public class DoWhileSample {
	public static void main(String[] args) {
		char c = 'a';
		do {
			System.out.print(c);
			//유니코드 변환해서 1증가한 유니코드가 문자로 변환
//			c = (char)(c + 1);
			c += 1;
		} while (c <= 'z');
	}
}