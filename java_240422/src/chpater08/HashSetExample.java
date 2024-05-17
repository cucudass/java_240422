package chpater08;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

class AA{}

public class HashSetExample {
	public static void main(String[] args) {
		//set 인터페이스 컬렉션 타입으로 HashSet 클래스 객체 생성
		Set<String> set = new HashSet<>(); //업캐스팅
//		Set<Object> set = new HashSet<>(); //업캐스팅
		set.add("Java");
		set.add("JDBC");
		set.add("Servlet/JSP");
//		set.add("Java"); //set 컬렉션에서는 중복 객체 추가 불가
		AA a = new AA();
//		set.add(a); //<Objet> 타입으로 사용 가능
		set.add("iBatis");
		
		int size = set.size();
		System.out.println("총 객체 수: " + size);
		
		Iterator<String> iterator = set.iterator();
		while (iterator.hasNext()) {
			String element = (String) iterator.next();
			System.out.println("\t"+element);
		}
		
		set.remove("JDBC"); //객체 삭제
		System.out.println("총 객체 수: " + set.size());
		/*
		Iterator<String> iterator2 = set.iterator();
		while (iterator2.hasNext()) {
			String element = (String) iterator2.next();
			System.out.println("\t"+element);
		}
		*/
		for (String element : set) {
			System.out.println("\t"+element);
		}
		
		if(set.isEmpty())
			System.out.println("비어 있음");
		else
			System.out.println("객체 있음");
		
		set.clear();//모두 삭제
		
		if(set.isEmpty())
			System.out.println("비어 있음");
		else
			System.out.println("객체 있음");
	}
}
