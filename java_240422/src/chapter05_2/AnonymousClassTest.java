package chapter05_2;

interface RemoteControl {
	void turnOn();
	void turnOff();
}

public class AnonymousClassTest {
	public static void main(String[] args) {
		RemoteControl rc = new RemoteControl() {//익명 클래스(인터페이스 이름 사용 -> 객체 구현)
			@Override
			public void turnOn() {
				System.out.println("TV turnOn");
			}
			
			@Override
			public void turnOff() {
				System.out.println("TV turnOff");
			}
		};
		rc.turnOn();
		rc.turnOff();
	}
}
