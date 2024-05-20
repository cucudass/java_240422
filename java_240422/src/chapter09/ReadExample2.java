package chapter09;

import java.io.FileInputStream;
import java.io.InputStream;

public class ReadExample2 {
	//throws Exception: 파일이 없을 경우 예외 발생
	public static void main(String[] args) throws Exception {
		InputStream is = new FileInputStream("D:\\text.txt"); //업캐스팅
		int readByte = 0;
		byte[] readbytes = new byte[3];
		String data = "";
		
		while (true) {
//			readByte = is.read(); //1byte 단위로 읽는다.(정수를 받음)
			readByte = is.read(readbytes); //3byte 단위로 읽는다.정수를 받음
			if(readByte == -1) //파일의 끝에는 -1이 존재
				break;
			//13 엔터(개행문자)
			//10 첫번째 열
			//System.out.println(readByte);
//			System.out.print(readByte); //형변환 오류
			data += new String(readbytes, 0, readbytes.length);
		}
		System.out.print(data);
		is.close();
	}
}
