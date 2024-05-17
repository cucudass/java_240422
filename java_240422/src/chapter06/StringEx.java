package chapter06;

public class StringEx {
	public static void main(String[] args) {
		String a = new String(" C#"); //heap 메모리에 저장
		String b = new String(",C++ "); //heap 메모리에 저장
		
		System.out.println(a.length()); //공백 포함 길이 3
		System.out.println(a.contains("#")); //문자열 포함 여부
		System.out.println(a.contains("*"));
		
		a = a.concat(b);
		System.out.println(a);//새로운 문자열 a를 가리킴
		
		a = a.trim();//앞 뒤 공백 제거
		System.out.println(a);
		
		a = a.replace("C#", "Java");//문자열 치환
		System.out.println(a);
		
		String s[] = a.split(","); //문자열을 분리
		for (int i = 0; i < s.length; i++) {
			System.out.println("분리된 문자열 " + i + ": " + s[i]);
		}
		
		a = a.substring(5); //인덱스값으로 시작하는 문자열 출력
		System.out.println(a); // Java,C++ => C++
		
		char c = a.charAt(2);
		System.out.println(c); //C++ => +
	}
}
