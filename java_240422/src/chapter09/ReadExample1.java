package chapter09;

import java.io.FileInputStream;
import java.io.InputStream;

public class ReadExample1 {
	//throws Exception: 파일이 없을 경우 예외 발생
	public static void main(String[] args) throws Exception {
		//FileInputStream : 바이트 단위 입력을 위한 하위 클래스
		InputStream is = new FileInputStream("D:\\text.txt"); //업캐스팅
		int readByte = 0;
		/*
		while (true) {
			readByte = is.read(); //byte 단위로 읽는다.
			if(readByte == -1) //파일의 끝에는 -1이 존재
				break;
			//13 엔터(개행문자)
			//10 첫번째 열
			//System.out.println(readByte);
			System.out.print((char)readByte);
		}
		*/
		while((readByte = is.read()) != -1) {
			System.out.print((char)readByte);
		}
		is.close();
	}
}
