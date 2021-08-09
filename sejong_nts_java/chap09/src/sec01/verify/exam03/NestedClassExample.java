package sec01.verify.exam03;

public class NestedClassExample {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Car myCar = new Car();
		
		Car.Tire tire = myCar.new Tire();
		
		Car.Engine engine = new Car.Engine();
	}
}
