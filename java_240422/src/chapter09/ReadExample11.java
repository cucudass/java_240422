package chapter09;

import java.io.FileReader;
import java.io.Reader;

public class ReadExample11 {
	public static void main(String[] args) throws Exception {
		//Reader: 문자 단위 입력을 위한 상위 클래스
		//FileReader: 문자 단위 입력을 위한 하위 클래스
		Reader reader = new FileReader("D:\\text.txt"); //업캐스팅
		int readData = 0;
		
		while (true) {
			readData = reader.read(); //한개의 문자 단위로 읽는다.
			if(readData == -1)
				break;
//			System.out.println(readData);
			System.out.print((char)readData);
		}
		reader.close();
	}
}
