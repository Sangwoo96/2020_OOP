package template;

public abstract class Car {
	public abstract void drive(); //�ݵ�� ����Ŭ�������� �����ؾ��ϴ� �޼���
	public abstract void stop();
	
	public void startCar() {
		System.out.println("�õ��� �մϴ�.");
	}
	public void turnOff() {
		System.out.println("�õ��� ���ϴ�.");
	}
	public void washCar() {} //���������� ����Ŭ�������� �������� �� �ִ� �޼���
	//�ó�����, final �޼����  ����Ŭ�������� �������̵� �Ұ���
	final public void run() {
		startCar();
		drive();
		stop();
		turnOff();
		washCar();
	}
}
