package chapter05_1;

//추상클래스에 추상메소드 없어도 됨.
abstract class Bird extends Animal {
	public int wing = 2;
	public void walk() {
		System.out.println("walk");
	}
	public void eat() {
		System.out.println("eat");
	}
}
