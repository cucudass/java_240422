package chapter07;

//T를 타입파라미터로 받는 제네릭
public class Box2<T> {
	private T t;
	
	//타입 파라미터를 리턴 타입으로 사용
	public T get() { return t; }
	
	//타입 파라미터를 메소드의 매개변수 타입으로 사용
	public void set(T t) { this.t = t;	}
}
