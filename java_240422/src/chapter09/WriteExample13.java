package chapter09;

import java.io.FileWriter;
import java.io.Writer;

public class WriteExample13 {
	public static void main(String[] args) throws Exception {
		Writer writer =  new FileWriter("d:/output13.txt"); //업캐스팅
		char[] data = "홍길동3".toCharArray();
//		writer.write(data);
		writer.write(data, 1, 2); //길동 -> 홍길동3에서 인덱스 1번에서 2글자를 읽어서 파일로 저장
		
		writer.close();
	}
}
