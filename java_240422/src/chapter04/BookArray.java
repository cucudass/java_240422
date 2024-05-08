package chapter04;

import java.util.Scanner;

class Book3{
	String title;
	String author;
	
	public Book3(String title, String author) {
		this.title = title;
		this.author = author;
	}
}
public class BookArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Book3[] book = new Book3[2];
		
		for (int i = 0; i < book.length; i++) {
			System.out.print("제목>>");
//			String title = sc.next();
//			nextLine: 입력값을 한 행을 받고 엔터
			String title = sc.nextLine();
			System.out.print("저자>>");
			String author = sc.nextLine();
			
			book[i] = new Book3(title, author);
		}
		
		for (int i = 0; i < book.length; i++) {
			System.out.println("("+book[i].title+", "+book[i].author+")");
		}
		sc.close();
	}
}
