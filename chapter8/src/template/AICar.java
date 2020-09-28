package template;

public class AICar extends Car {

	@Override
	public void drive() {
		System.out.println("스스로 웁직입니다.");
	}

	@Override
	public void stop() {
		System.out.println("스스로 멈춥니다.");
	}
	
	@Override
	public void washCar() {
		System.out.println("자동 세차를 합니다.");
	}

}
