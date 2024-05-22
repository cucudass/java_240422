package chapter14;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Product {
	int id;
	String name;
	int price;

	public Product(int id, String name, int price) {
		this.id = id;
		this.name = name;
		this.price = price;
	}
	
	
}

public class StreamTest {
	public static void main(String[] args) {
		List<Product> list = new ArrayList<Product>(); //업캐스팅
		list.add(new Product(1, "NoteBook", 100));
		list.add(new Product(2, "TV", 320));
		list.add(new Product(3, "Washing Machine", 250));
		list.add(new Product(4, "Air Conditioner", 500));
		//스트림 생성.가격이 300 초과.제품의 이름
		List<String> result = list.stream().filter(p -> p.price > 300).map(p->p.name).collect(Collectors.toList());
		System.out.println(result);
	}
}