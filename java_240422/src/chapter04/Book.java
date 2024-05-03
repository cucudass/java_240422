package chapter04;

public class Book {
	String title;
	String author;
	
	//생성자
	public Book(String t, String a) {
		//매개변수를 멤버로 저장
		title = t;
		author = a;
	}
	
	public Book(String t) { //춘향전을 매개변수로 받음
		//매개변수를 멤버로 저장
		title = t;
		author = "작자미상";
	}
	
	public static void main(String[] args) {
//		new Book(); 생장자가 존재 시, 자동으로 기본생성자를 만들지 못해서 오류
		Book littlePrince = new Book("어린왕자", "생텍쥐베리");
		Book loveStory = new Book("춘향전");
		
		System.out.println(littlePrince.title + " " + littlePrince.author);
		System.out.println(loveStory.title + " " + loveStory.author);
	}
}
