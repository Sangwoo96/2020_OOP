package templatepratice;

public class Player {
	private PlayerLevel level;
	
	public Player() {
		level = new Level1();
		level.showPlayerLevel();
	}
	
	public PlayerLevel getLevel(){
		return level;
	}
	
	public void upgradeLevel(PlayerLevel level) {
		this.level = level;
		level.showPlayerLevel();
	}
	
	public void go(int count) {
		level.go(count);
	}
}
