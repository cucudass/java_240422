package chapter05;

public class InstanceofExample {
	public static void method1(Parent parent) {
//		Parent parentA =  new Child(); => child 객체를 판단
		//instanceof: 객체가 해당 클래스 타입인지 판단(true/false)
		if(parent instanceof Child) {
			Child child = (Child)parent;
//			System.out.println("성공");
			System.out.println("method1 - child로 변환 성공");
		} else {
			System.out.println("method1 - child로 변환 실패");
		}
	}
	public static void method2(Parent parent) {
		Child child = (Child)parent;
		System.out.println("method2 - child로 변환 성공");
	}
	public static void main(String[] args) {
		//업캐스팅
		Parent parentA =  new Child();
		method1(parentA);
		method2(parentA);
		
		Parent parentB = new Parent();
		method1(parentB); //실패
//		method2(parentB); //exception 발생 (강제 변환)
		
		Parent parentC = new Parent();
//		Child child = (Child)parentC; //exception 발생 (강제 변환)

	}
}
