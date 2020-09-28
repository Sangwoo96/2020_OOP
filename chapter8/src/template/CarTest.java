package template;

public class CarTest {

	public static void main(String[] args) {
		Car aiCar = new AICar();
		Car maualCar = new MaualCar();
		
		aiCar.run();
		System.out.println("======================================");
		maualCar.run();
	}
}
