package chapter10;

public class TestThread {
	public static void main(String[] args) {
		TimerThread th = new TimerThread();
		//스레드 실행되면서 JVM 스케줄링
		th.start();
	}
}
