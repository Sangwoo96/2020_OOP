package staticex;

public class StaticTest {

	public static void main(String[] args) {
		Student student1 = new Student("�����");
		Student student2 = new Student("������");
		
		student1.showStudentInfo();
		student2.showStudentInfo();
		System.out.println(Student.getSerialNum());
	}
}
