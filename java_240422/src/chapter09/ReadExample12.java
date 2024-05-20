package chapter09;

import java.io.FileReader;
import java.io.Reader;

public class ReadExample12 {
	public static void main(String[] args) throws Exception {
		Reader reader = new FileReader("D:\\text.txt"); //업캐스팅
		int readData = 0;
		char[] cbuf = new char[2];
		String data = "";
		
		while (true) {
//			readData = reader.read(); //한개의 문자 단위로 읽는다.
			readData = reader.read(cbuf); //2개의 문자 단위르 읽는다.
			if(readData == -1)
				break;
//			System.out.print((char)readData);
			data += new String(cbuf, 0, readData);
		}
		System.out.println(data);
		reader.close();
	}
}
