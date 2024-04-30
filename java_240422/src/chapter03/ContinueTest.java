package chapter03;

/*
 * 문자열에서 특정 문자를 찾는다.
 * 찾은 갯수를 출력
 * */
public class ContinueTest {
	public static void main(String[] args) {
		int count = 0;
		//n의 개수
		String s = "no news is good news";
		
		for (int i = 0; i < s.length(); i++) {
			//charAt: 문자를 가져오는 메소드
			if(s.charAt(i) != 'n')
				continue;
			count++;
		}
		System.out.println("n의 갯수: " + count);
	}
}
