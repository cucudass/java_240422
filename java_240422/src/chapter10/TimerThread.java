package chapter10;

public class TimerThread extends Thread {
	int n = 0;
	@Override
	public void run() {
		while(true) {
			System.out.println(n);
			n++;
			try {
				sleep(1000); //1마다 실행
			} catch (InterruptedException e) {
				e.printStackTrace(); //예외처리 기본 메시지 출력
			}
		}
	}
}
