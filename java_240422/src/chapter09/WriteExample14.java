package chapter09;

import java.io.FileWriter;
import java.io.Writer;

public class WriteExample14 {
	public static void main(String[] args) throws Exception {
		Writer writer =  new FileWriter("d:/output14.txt"); //업캐스팅
//		char[] data = "홍길동3".toCharArray();
		String data = "안녕 자바 프로그램";
//		writer.write(data, 1, 2); //길동 -> 홍길동3에서 인덱스 1번에서 2글자를 읽어서 파일로 저장
		writer.write(data, 3, 2); //자바 -> 인덱스 3번에서 2글자
		
		writer.close();
	}
}
