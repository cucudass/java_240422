package chapter02;

import java.util.Scanner;

public class CoffeePrice {
	public static void main(String[] args) {
		System.out.print("무슨 커피 드릴까요?");
		Scanner sc = new Scanner(System.in);
		String order = sc.next();
		int price = 0;
		
		switch (order) {
		case "에스프레소":
		case "카푸치노":
		case "카페라떼":
			price = 3500;
			break;
		case "아메리카노":
			price = 2000;
			break;
		default:
			System.out.println("메뉴에 없습니다!!");
			break;
		}
		if(price > 0)
			System.out.println(order + "의 가격은 " + price + "입니다.");
		sc.close();
	}
}
