package chapter12;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArraysTest2 {
	public static void main(String[] args) {
		String[] a = {"a","b","c","d"};
		int[] b = {1,5,5,7,3,3,42,6,8,45323,4,63,2,1};
		
		System.out.println(Arrays.asList(a));
		List<String> list = Arrays.asList(a);
		System.out.println("@# list.get(0)===>" + list.get(0));
		
		Arrays.sort(b, 4, 14); //인덱스 정렬(4 ~ 13)
		System.out.println(Arrays.toString(b));
		Arrays.sort(b); //오름차순 정렬
		System.out.println(Arrays.toString(b));
		
		Arrays.sort(a, Collections.reverseOrder()); //내림차순 정렬
		System.out.println(Arrays.toString(a));

		Arrays.sort(a); //내림차순 정렬
		System.out.println(Arrays.toString(a));

		Arrays.sort(a, 2, 4, Collections.reverseOrder()); //인덱스 2,3 내림차순 정렬
		System.out.println(Arrays.toString(a));
		
		String[] cc = {"11","12","13","23","53","223","145","53"};
		Arrays.sort(cc, Collections.reverseOrder());
		System.out.println(Arrays.toString(cc));
		
		int[] c = Arrays.copyOf(b, b.length); //배열 객체 복사
		System.out.println(Arrays.toString(c));
		
		String[] d = Arrays.copyOf(a, 3); //a 배열 객체를 크기 3인 배열로 복사
		System.out.println(Arrays.toString(d));
	}
}
