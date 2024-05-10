package chapter05;

public class ChildExample {
	public static void main(String[] args) {
		//Parent 클래스에 기본생성자 호출, Child 클래스에 기본생성자 호출
		//업캐스팅(슈퍼 클래스 타입으로 서브 클래스 객체 생성)
		Parent parent = new Child();
		parent.field1 = "data1";
//		parent.field2 = "data2"; 업캐스팅 된 객체는 서브 클래스 멤버 접근 불가
		parent.method1();
		parent.method2();
//		parent.method3();  업캐스팅 된 객체는 서브 클래스 멤버 접근 불가
		
		Child child = (Child) parent;
		//다운캐스팅 서브 클래스 멤버 접근 가능
		child.filed2 = "data2";
		child.method3();
	}
}
