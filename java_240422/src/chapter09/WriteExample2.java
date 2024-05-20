package chapter09;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class WriteExample2 {
	public static void main(String[] args) throws Exception {
		OutputStream os =  new FileOutputStream("d:/output2.txt"); //업캐스팅
		byte[] data = "def".getBytes();
		os.write(data);
//		for (int i = 0; i < data.length; i++) {
//			os.write(data[i]);
//		}
		
		os.close();
	}
}
