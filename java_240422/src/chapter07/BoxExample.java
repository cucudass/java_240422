package chapter07;

public class BoxExample {
	public static void main(String[] args) {
		Box box = new Box();
		Object box2 = new Box();
		
		box.set("홍길동"); //업캐스팅
		String name = (String) box.get(); //다운캐스팅
		System.out.println(name);
		
		box.set(777); //업캐스팅
		int number = (int) box.get(); //다운캐스팅
		System.out.println(number);
		
		box.set(new Apple()); //업캐스팅
		Apple apple = (Apple) box.get(); //다운캐스팅
		System.out.println(apple); //chpater07.Apple@515f550a
	}
}
