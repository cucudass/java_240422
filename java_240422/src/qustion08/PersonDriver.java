package qustion08;

import java.util.Scanner;

public class PersonDriver {
	public static void main(String[] args) {
		Person person1 = new Person();
		Person person2 = new Person();
		Person[] p = { person1, person2 };
		String fname = "", lname = "";
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < p.length; i++) {
			System.out.print("성을 입력하세요: ");
			lname = sc.next();
			System.out.print("이름을 입력하세요: ");
			fname = sc.next();
					
			p[i].lastName = lname;
			p[i].firstName = fname;
			
			System.out.println("성: " + p[i].getLastName() + " 이름: " +p[i].getFirstName() + " 성명의 길이: " + p[i].getLength());
		}
		sc.close();
	}
}
