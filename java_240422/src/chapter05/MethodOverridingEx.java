package chapter05;

class Shape {
	public void draw() {
		System.out.println("Shape");
	}
}

class Line extends Shape {
	@Override
	public void draw() {
		System.out.println("Line");
	}
}

class Rect extends Shape {
	@Override
	public void draw() {
		System.out.println("Rect");
	}
}

class Circle extends Shape {
	@Override
	public void draw() {
		System.out.println("Circle");
	}
}

public class MethodOverridingEx {
	//Shape p = new Line(); upcasting
	//Shape p = new Shape();
	static void paint(Shape p) {
		//업캐스팅에 의해서 슈퍼클래스의 draw 메소드로 갔다가 오버라이딩 되어 Line으로 간다.(동적 바인딩)
		p.draw();
	}
	public static void main(String[] args) {
		Line line = new Line();
		paint(line); //Line(업캐스팅, 오버라이딩)
		paint(new Shape()); //Shape
		paint(new Rect()); //Rect(업캐스팅, 오버라이딩)
		paint(new Circle()); //Circle(업캐스팅, 오버라이딩)
	}
}
