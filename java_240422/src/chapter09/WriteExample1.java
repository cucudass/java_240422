package chapter09;

import java.io.FileOutputStream;
import java.io.OutputStream;

// ctrl+shift+o : 사용하지 않는 import 삭제
public class WriteExample1 {
	//FileOutputStream : 바이트 단위 출력을 위한 하위 클래스
	public static void main(String[] args) throws Exception {
		OutputStream os =  new FileOutputStream("d:/output.txt"); //업캐스팅
		byte[] data = "abc".getBytes();
		
		for (int i = 0; i < data.length; i++) {
			//FileOutputStream 객체에 바이트 배열원소를 넣는다.
			os.write(data[i]);
		}
		os.close();
	}
}
