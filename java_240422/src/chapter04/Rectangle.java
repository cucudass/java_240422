package chapter04;

import java.util.Scanner;

public class Rectangle {
	int width;
	int height;
	
	public int getArea() {
		return width * height;
	}
	
	public static void main(String[] args) {
		 //구성 멤버3개
		Rectangle rect = new Rectangle(); //new 연산자로 Rectangle 클래스 생성, rect 참조변수
		
		Scanner sc = new Scanner(System.in);
		System.out.print(">>");
		//객체의 멤버변수로 접근
		rect.width = sc.nextInt();
		rect.height = sc.nextInt();
		//메소드 호출
		System.out.println("사각형의 면적은 " + rect.getArea());
		sc.close();
	}
}
