package interfaceex;

public class ShelfTest {

	public static void main(String[] args) {
		Queue shelf = new BookShelf();
		shelf.enQueue("�¹���1");
		shelf.enQueue("�¹���2");
		System.out.println(shelf.getSize());
		shelf.deQueue();
		System.out.println(shelf.getSize());
	}

}
