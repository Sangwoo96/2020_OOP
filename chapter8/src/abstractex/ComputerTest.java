package abstractex;

public class ComputerTest {

	public static void main(String[] args) {
	
		//Computer computer = new Computer(); �Ұ��� -> �߻�Ŭ����
		Computer computer = new DeskTop();
		computer.display();
		computer.turnOn();
		computer.turnOff();
		
		Computer noteBook1 = new MyNoteBook();
		NoteBook noteBook2 = new MyNoteBook();
		
		noteBook2.turnOff();
		noteBook2.turnOn();
	}
}