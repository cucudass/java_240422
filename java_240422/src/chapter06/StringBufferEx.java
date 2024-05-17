package chapter06;

public class StringBufferEx {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("This");
		System.out.println(sb);
		
		sb.append(" is pencil"); //문자열 연걸. 추가되면서 수정됨
		System.out.println(sb); //This is pencil
		
		sb.insert(7, " my");
		System.out.println(sb); //This is my pencil
		
		sb.replace(8, 10, "your"); //my -> your
		System.out.println(sb); //This is your pencil
		
		sb.delete(8, 13); //문자열 삭제
		System.out.println(sb); //This is pencil
		
		sb.setLength(4); //문자열 길이 수정
		System.out.println(sb); //This
	}
}
