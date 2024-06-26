package chapter13;

import java.util.function.Function;

public class FunctionTest {
	public static void main(String[] args) {
		//Function 인터페이스로 람다식 객체 구현
		Function<Integer, Integer> f1 = i -> i * 4;
		System.out.println(f1.apply(3));
		
		Function<String, Integer> f2 = s -> s.length();
		System.out.println(f2.apply("Hello"));
	}
}
