package chapter04;

public class Circle2 {
	//매개변수 값이 멤버변수로 저장
	int radius;
	String name;
	
	public double getArea() {
		return 3.14 * radius * radius;
	}
	
	//오버로딩
	public Circle2() {//생성자 호출됨
		radius = 1; //반지름 1
		name = "";
	}
	//매개변수와 멤버변수가 같을때 this를 사용한다.
	public Circle2(int radius, String n) { //생성자 호출
		this.radius = radius; //매개변수 값 저장(10)
		name = n; //매개변수 값 저장(자바피자)
	}
	
	public static void main(String[] args) {
		//객체 생성하면서 생성자 호출
		/*
		Circle2 pizza = new Circle2();//반지름 1, 이름 없는 객체 생성
		
		double area = pizza.getArea();
		System.out.println(area);
		*/
		
		//객체 생성하면서 생성자 호출(매개변수 10, 자바피자를 가지고 감)
		Circle2 pizza = new Circle2(10, "자바피자");//반지름 10, 이름 자바피자 객체 생성
		double area = pizza.getArea();
		System.out.println(pizza.name + "의 면적 "+area);
		
		
//		Circle2 donut = new Circle2();
		Circle2 donut = new Circle2(2,"");
		donut.name = "자바도넛";
		area = donut.getArea();
		System.out.println(donut.name + "의 면적 " + area);
		
		
		
		
	}
}
