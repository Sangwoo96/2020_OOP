package classpart;

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student studentLee = new Student(1, "�̼���", "����"); 
//		studentLee.studentName = "�̼���";
//		studentLee.address = "����";
		
		studentLee.showStudentInfo();
		
		Student studentKim = new Student(2, "������");
//		studentKim.studentName = "������";
//		studentKim.address = "����";
		
		studentKim.showStudentInfo();
		System.out.println(studentLee); //packagename.Class@stack�� ������������ ����Ű�� heap�� �ּ�
		System.out.println(studentKim);
		
		Human person = new Human();
		person.age = 40;
		person.child = 3;
		person.married = true;
		person.name = "person";
		person.getHumanInfo();
	}

}