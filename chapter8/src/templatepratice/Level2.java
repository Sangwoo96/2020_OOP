package templatepratice;

public class Level2 extends PlayerLevel{
	@Override
	public void run() {
		System.out.println("천천히 달립니다.");
	}

	@Override
	public void jump() {
		System.out.println("점프를 합니다.");
	}

	@Override
	public void turn() {
		System.out.println("방향전환을 못합니다.");
	}

	@Override
	public void showPlayerLevel() {
		System.out.println("***********중급자 레빌*************");
	}
}
