package chapter02;

public class VariableUseExample {
	public static void main(String[] args) {
		int hour = 3;
		int minute = 5;
//		System.out.println(hour + minute);
		System.out.println(hour + "시간 " + minute + "분"); // + 할 때 문자열 존재시, 전체가 문자열이 됨
		
		int totalMinute = hour * 60 + minute;
//		System.out.println(totalMinute);
		System.out.println("총 " + totalMinute + "분");
	}
}
