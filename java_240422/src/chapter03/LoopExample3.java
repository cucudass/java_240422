package chapter03;

/*
 * do while 문 사용
 * 변화되는 i 값 출력
 * */
public class LoopExample3 {
	public static void main(String[] args) {
		int i = 10;
		//최소 1번은 실행
		do {
			System.out.println(i);
			i--;
		} while (i < 3);
	}
}
