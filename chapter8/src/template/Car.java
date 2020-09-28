package template;

public abstract class Car {
	public abstract void drive(); //반드시 하위클래서에서 정의해야하는 메서드
	public abstract void stop();
	
	public void startCar() {
		System.out.println("시동을 켭니다.");
	}
	public void turnOff() {
		System.out.println("시동을 끕니다.");
	}
	public void washCar() {} //선택적으로 하위클래스에서 재정의할 수 있는 메서드
	//시나리오, final 메서드는  하위클래스에서 오버라이딩 불가능
	final public void run() {
		startCar();
		drive();
		stop();
		turnOff();
		washCar();
	}
}
