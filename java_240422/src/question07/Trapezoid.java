package question07;

import java.util.Scanner;

public class Trapezoid {
	int down, up, height;

	public double getArea() {
		return (down + up) * height / 2;
	}
	public static void main(String[] args) {
		Trapezoid tra = new Trapezoid();
		Scanner sc = new Scanner(System.in);
		
		System.out.print(">>");
		tra.down = sc.nextInt();
		tra.up = sc.nextInt();
		tra.height = sc.nextInt();
		
		System.out.println("사다리꼴의 면적은 "+tra.getArea());
		sc.close();
	}
}
