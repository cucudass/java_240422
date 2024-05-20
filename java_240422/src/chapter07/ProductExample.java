package chapter07;

public class ProductExample {
	public static void main(String[] args) {
		Product<Tv, String> product1 = new Product<Tv, String>();//T->Tv, M -> String으로 타입 설정
		product1.setKind(new Tv());
		product1.setModel("스마트TV");
		
		Tv tv = product1.getKind(); //TV 객체
		//chpater07.Tv@3d012ddd(패키지.클래스@해시코드)
		System.out.println(tv);
		
		String tvModel = product1.getModel();
		System.out.println(tvModel);
		
		Product<Car, String> product2 = new Product<Car, String>();
		product2.setKind(new Car());
		product2.setModel("디젤");
		//chpater07.Car@5e91993f(패키지.클래스@해시코드)
		Car car = product2.getKind();
		System.out.println(car);
		
		String carModel = product2.getModel();
		System.out.println(carModel);
	}
}
