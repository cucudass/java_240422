package chapter09;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileExample {
	public static void main(String[] args) throws Exception {
//		File dir = new File("d:/aaa");
		File dir = new File("d:/aaa/bbb"); //하위 디렉토리 포함
		File file1 = new File("d:/aaa/bbb/file1.txt");//파일
		File file2 = new File("d:/aaa/bbb/file2.txt");//파일
		File file3 = new File("d:/aaa/bbb/file3.txt");//파일
		
		//파일 만들기
//		dir.createNewFile();
//		dir.mkdir(); //디렉토리 생성
		dir.mkdirs(); //하위 디렉토리까지 생성
		file1.createNewFile(); //파일 만들기
		file2.createNewFile(); //파일 만들기
		file3.createNewFile(); //파일 만들기
		
		File test = new File("d:/aaa"); //디렉토리 정보를 가지는 객체 생성
		File[] contents = test.listFiles(); //디렉토리 정보(하위 디렉토리 + 파일)
		System.out.println("날짜		시간	형태		크기		이름");
		System.out.println("-------------------------------------------------------------");
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd a hh:mm");
		for (int i = 0; i < contents.length; i++) {
			//19700101부터 오늘까지의 밀리초로 계산된 값
//			System.out.print(contents[i].lastModified()); //마지막 생성일자
//			System.out.print(new Date(contents[i].lastModified())); //마지막 생성일자
			System.out.print(sdf.format(new Date(contents[i].lastModified()))); //마지막 생성일자
			if (contents[i].isDirectory()) {
				System.out.println("\t<DIR>\t\t"+contents[i].getName()); //디렉토리나 파일의 이름
			} else {
				System.out.println("\t\t\t"+contents[i].length()+"\t"+contents[i].getName()); //디렉토리나 파일의 이름
			}
		}
	}
}
