package chapter04;

public class Book2 {
	String title;
	String author;
	
	public Book2(String title, String author) {
		System.out.println("생성자1 호출됨");
		this.title = title;
		this.author = author;
	}
	
	public Book2(String title) {
		this(title, "작자 미상"); //첫번째 라인에 안오면 오류 발생
		System.out.println("생성자2 호출됨");
	}
	
	public Book2() {
		this("", "");
		System.out.println("생성자3 호출됨");
	}
	
	void show() {
		System.out.println(title + " " + author);
	}
	public static void main(String[] args) {
//		Book2 littlePrince = new Book2("어린 왕자", "생텍쥐베리");
//		Book2 loveStroy = new Book2("춘향전");
		Book2 emptybook = new Book2();
		
//		System.out.println(littlePrince.title + " " + littlePrince.author);
//		littlePrince.show();
//		loveStroy.show();
		emptybook.show();
	}
}
