package templatepratice;

public class PlayerTest {

	public static void main(String[] args) {
		Player player = new Player();
		player.go(1);
		
		Level2 level2 = new Level2();
		player.upgradeLevel(level2);
		player.go(1);
		
		Level3 level3 = new Level3();
		player.upgradeLevel(level3);
		player.go(1);
	}
}
