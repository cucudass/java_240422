package chapter09;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class WriteExample3 {
	public static void main(String[] args) throws Exception {
		OutputStream os =  new FileOutputStream("d:/output3.txt"); //업캐스팅
		byte[] data = "def".getBytes();
//		os.write(data);
		os.write(data, 1, 2); //인덱스 1에서 2글자
		os.flush(); //네트워크가 끊겻을때 전송되지 못한 데이터를 보낸다.

		os.close();
	}
}
