package abstractex;

public abstract class Computer {
	
	public abstract void display(); //���� Ŭ�������� �����Ѵٴ� �ǹ�(�߻�Ŭ����)
	public abstract  void typing();
	public void turnOn() {
		System.out.println("������ �մϴ�.");
	}
	
	public void turnOff() {
		System.out.println("������ ���ϴ�.");
	}
}
