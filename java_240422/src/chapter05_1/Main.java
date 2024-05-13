package chapter05_1;

public class Main {
	public static void main(String[] args) {
		Animal a;//추상 클래스는 객체 생성 불가능, 참조변수 선언은 가능
		Penguin p = new Penguin();
		p.swim();
		
		Bird b2 = new Penguin();
//		b2.siwm(); //업캐스팅은 슈퍼클래스만 접근 가능
		b2.walk();
		Penguin p3 = (Penguin)b2;//다운캐스팅
		p3.swim();
		
		Bird d = new Duck();//업캐스팅
		d.eat();
		Duck d2 = (Duck)d; //다운캐스팅
		d2.fly();
		
		//추상클래스를 참조변수로 선언
		Animal d3 = new Duck();
		int x = d3.life;
		System.out.println("x===>"+x);
		
//		new Swim2();//인터페이스 객체 생성 불가
		Swim2 s = new Penguin(); //인터페이스를 참조변수 선언
		s.swim();

		Swim2[] s2 = new Swim2[2]; //인터페이스 배열 생성 -> 객체 배열과 형태가 비슷
		s2[0] = new Penguin();
		s2[1] = new Duck();
		s2[0].swim();
		s2[1].swim();
//		컴파일러 단계가 아닌, 런타임 실행시 오류 발생
//		s2[2] = new Penguin();
		
	}
}
