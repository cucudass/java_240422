package chapter10;

public class ThreadMainEx {
	public static void main(String[] args) {
		String name = Thread.currentThread().getName(); //현재 실행중인 스레드의 이름
		long id = Thread.currentThread().getId(); //현재 실행중인 스레드의 id
		int priority = Thread.currentThread().getPriority(); //현재 실행중인 스레드의 우선순위
		Thread.State s = Thread.currentThread().getState(); //현재 실행중인 스레드의 상태
		
		System.out.println("현재 스레드 이름: " + name);
		System.out.println("현재 스레드 id: " + id);
		System.out.println("현재 스레드 priority: " + priority);
		System.out.println("현재 스레드 state: " + s);
	}
}
