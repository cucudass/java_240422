package chapter03;

/*
 * 문자열에서 r 알파벳 갯수 구하기
 * toCharArray() 메소드 사용
 * */

public class Ex3_8 {
	public static void main(String[] args) {
		int count = 0;
		String str = "Programming is fun! Right?";
		char[] charArr = str.toCharArray(); //문자열에서 문자를 1개씩 가져옴(P~?)
		
		for (int i = 0; i < charArr.length; i++) {
			//if(charArr[i] == 'R' || charArr[i] == 'r')
			if(Character.toUpperCase(charArr[i]) == 'R')
				count++;
		}
		System.out.println("=> R(r)의 갯수: " + count);
	}
}
