package templatepratice;

public class Level1 extends PlayerLevel{

	@Override
	public void run() {
		System.out.println("õõ�� �޸��ϴ�.");
	}

	@Override
	public void jump() {
		System.out.println("������ ���մϴ�.");
	}

	@Override
	public void turn() {
		System.out.println("������ȯ�� ���մϴ�.");
	}

	@Override
	public void showPlayerLevel() {
		System.out.println("***********�ʱ��� ����*************");
	}
}
