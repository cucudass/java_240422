package chapter04;

public class Circle {
//	멤버변수
	int radius;
	String name;
		
	//오버로딩
	public Circle() { }//클래스하고 이름이 똑같은 메소드: 생성자(기본)
	public Circle(int a) { }//클래스하고 이름이 똑같은 메소드: 생성자(매개변수 1개)
	public Circle(int a, int b) { }//클래스하고 이름이 똑같은 메소드: 생성자(매개변수 2개)
	
	//멤버함수
	public double getArea() {
		return 3.14 * radius * radius;
	}
	
	public static void main(String[] args) {
		Circle pizza;//참조변수 선언, Circle이 클래스
//		new Circle(); //이름 없는 Circle
		pizza = new Circle(); //객체 생성 //이름이 pizza
		
		pizza.radius = 10; //멤버변수 값 세팅
		pizza.name = "자바피자"; //멤버변수 값 세팅
		
		double area = pizza.getArea(); //멤버함수 호출
		System.out.println(pizza.name + "의 면적은 " + area);
		
		Circle donut = new Circle(); //객체 생성 //이름이 donut
		donut.radius = 2;
		donut.name = "자바도넛";
		area = donut.getArea();
		System.out.println(donut.name + "의 면적은 " + area);
		
	}
}
