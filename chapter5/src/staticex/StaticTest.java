package staticex;

public class StaticTest {

	public static void main(String[] args) {
		Student student1 = new Student("³²»ó¿ì");
		Student student2 = new Student("±èÈñÁ¤");
		
		student1.showStudentInfo();
		student2.showStudentInfo();
		System.out.println(Student.getSerialNum());
	}
}
