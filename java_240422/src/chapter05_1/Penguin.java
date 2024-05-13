package chapter05_1;

//public class Penguin extends Bird, Swim { 다중 상속 안됨.
//인터페이스는 implements 키워드 사용, 다중 상속 가능
//생명 1, 날개2, 걷다, 먹는다. + 수영한다(인터페이스) 멤버 5개
public class Penguin extends Bird implements Swim2 {
	@Override
	public void swim() {
		System.out.println("penguins swim");
	}
//	public void swim() {
//		System.out.println("penguins swim");
//	}
}
