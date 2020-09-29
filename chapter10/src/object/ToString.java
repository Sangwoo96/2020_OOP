package object;

class Book{
	String title;
	String author;
	
	public Book(String title, String author) {
		this.title = title;
		this.author = author;
				
	}
}
public class ToString {
	public static void main(String[] args) {
		Book book = new Book("토지", "박경림");
		System.out.println(book);
		
		String str = new String("토지");
		System.out.println(str);
	}
}
