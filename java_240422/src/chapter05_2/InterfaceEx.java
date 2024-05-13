package chapter05_2;

//기본폰, 전화를 걸어서 100초 동안 응답없으면 타임아웃
//전화거는 기능, 받는 기능, 화면에 폰이라고 출력
interface PhoneInterface {
	int TIMEOUT = 100; //public static final 생략
	void sendCall(); //public abstract 생략
	void receiveCall();
	
	default void printLogo() { //default(일반 메소드)는 구현해야 함
		System.out.println("** Phone **");
	}
}

class SamsungPhone implements PhoneInterface {
	//추상메소드 오버라이딩
	@Override
	public void sendCall() {
		System.out.println("띠리리리링");
	}
	@Override
	public void receiveCall() {
		System.out.println("전화가 왔습니다.");
	}
	//삼성폰 고유의 기능
	public void flash() {
		System.out.println("전화에 불이 켜졌습니다.");
	}
}

public class InterfaceEx {
	public static void main(String[] args) {
		SamsungPhone phone = new SamsungPhone();
		
		phone.printLogo();
		phone.sendCall();
		phone.receiveCall();
		phone.flash();
	}
}
