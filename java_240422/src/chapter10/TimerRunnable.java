package chapter10;

//Runnable 인터페이스 상속받아서 스레드 구현
public class TimerRunnable implements Runnable {
	int n = 0;
	@Override
	public void run() {
		while(true) {
			System.out.println(n);
			n++;
			try {
				Thread.sleep(1000); //1초마다 실행
			} catch (InterruptedException e) {
				e.printStackTrace(); //예외처리 기본 메시지 출력
			}
		}
	}
}
