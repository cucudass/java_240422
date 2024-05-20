package chapter09;

import java.io.FileWriter;
import java.io.Writer;

public class WriteExample11 {
	public static void main(String[] args) throws Exception {
		//Writer: 문자 단위 출력을 위한 상위 클래스
		//FileWriter: 문자 단위 출력을 위한 하위 클래스
		Writer writer =  new FileWriter("d:/output11.txt"); //업캐스팅
		char[] data = "홍길동".toCharArray();
		
		for (int i = 0; i < data.length; i++) {
			//wirter 객체에 write 메소드로 "홍길동"을 하나씩 받아서 파일로 저장
			writer.write(data[i]);
		}
		writer.close();
	}
}
