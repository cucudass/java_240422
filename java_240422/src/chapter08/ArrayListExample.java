package chapter08;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
	public static void main(String[] args) {
		//제네릭 타입파라미터->String
		//upcasting
		List<String> list = new ArrayList<String>();
		list.add("Java");
		list.add("JDBC");
		list.add("Servlet/JSP");
		list.add(2, "Database"); //-> 2번 인덱스에 삽입되어 기존 2번이 밀려남 3번 인덱스: Servlet/JSP
		list.add("Spring");
		
		int size = list.size();
		System.out.println("총 list의 갯수: " + size);
		
		String skill = list.get(2);
		System.out.println("2번째 인덱스: " + skill);
		
		for (int i = 0; i < list.size(); i++) {
			/*
			 0: Java
			 1: JDBC
			 2: Database
			 3: Servlet/JSP
			 4: Spring
			*/
			String str = list.get(i);
			System.out.println(i+": "+str);
		}
		
		System.out.println();
		list.remove(2); //인덱스로 객체 삭제
		for (int i = 0; i < list.size(); i++) {
			String str = list.get(i);
			System.out.println(i+": "+str);
		}
		
		System.out.println();
		list.remove("Spring"); //
		for (int i = 0; i < list.size(); i++) {
			String str = list.get(i);
			System.out.println(i+": "+str);
		}
	}
}
