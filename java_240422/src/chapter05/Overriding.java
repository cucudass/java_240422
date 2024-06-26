package chapter05;

class Weapon {
	protected int fire() {
		return 1; //기본 공격력:1
	}
}

class Cannon extends Weapon {
	@Override
	protected int fire() {
		return 10;//탱크 공격력: 10
	}
}

public class Overriding {
	public static void main(String[] args) {
		Weapon weapon; 
		weapon = new Weapon();
		System.out.println("기본 무기의 살상 능력은 " + weapon.fire());
		
		weapon = new Cannon(); //업캐스팅
		System.out.println("대포의 살상 능력은 " + weapon.fire());
	}
}
