package object;

class Book implements Cloneable{
	String title;
	String author;
	
	public Book(String title, String author) {
		this.title = title;
		this.author = author;
				
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
}
public class ToString {
	public static void main(String[] args) throws CloneNotSupportedException {
		Book book = new Book("토지", "박경림");
		System.out.println(book);
		
		String str = new String("토지");
		System.out.println(str);
		
		Book book2 = (Book)book.clone();
		System.out.println(book2.author);
	}
}
