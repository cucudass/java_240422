package question01;

import java.util.Scanner;

//public class : 자바파일안에 2개 이상 존재시 오류
//JVM이 수 많은 class 에서 public class를 찾아감
//class, method 여러 개 사용해도 무관
public class ExCalculation {
	//JVM이 수 많은 method에서 main 메소드를 찾아감
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("2개의 실수 입력>>");
		float a = sc.nextFloat();
		float b = sc.nextFloat();
		System.out.println("두수의 덧셈은 " + (a+b));
		System.out.println("두수의 뺄셈은 " + (a-b));
		System.out.println("두수의 곱셈은 " + (a*b));
		System.out.println("두수의 나눗셈은 " + (a/b));
		sc.close();
	}
}
