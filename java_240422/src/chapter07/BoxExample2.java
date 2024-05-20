package chapter07;

public class BoxExample2 {
	public static void main(String[] args) {
		//제네릭 타입 파라미터: String
//		Box2<String> box1 = new Box2<String>();
		Box2<String> box1 = new Box2<>(); //자바7부터 생략 가능
		
		box1.set("hello");
//		box1.set(777); //컴파일 단계에서 제네릭 타입 감지
		String greet = box1.get();
		System.out.println(greet);
		
		Box2<Integer> box2 = new Box2<Integer>();
		box2.set(777);
		int value = box2.get(); //언박싱
		System.out.println(value);
	}
}
