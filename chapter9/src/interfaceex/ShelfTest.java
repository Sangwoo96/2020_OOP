package interfaceex;

public class ShelfTest {

	public static void main(String[] args) {
		Queue shelf = new BookShelf();
		shelf.enQueue("ลยน้ป๊ธฦ1");
		shelf.enQueue("ลยน้ป๊ธฦ2");
		System.out.println(shelf.getSize());
		shelf.deQueue();
		System.out.println(shelf.getSize());
	}

}
