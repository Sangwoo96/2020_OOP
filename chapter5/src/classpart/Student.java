package classpart;

public class Student{ 
	private int studentID; //�������, �Ӽ�
	public String studentName;
	public String studentAddress;
	
	//Student ������ �� ��, �Ű������� �ٸ� -> �����ε�
	public Student(int id, String name, String address) {
		studentID = id;
		studentName = name;
		studentAddress = address;
	}
	
	public Student(int id, String name) {
		studentID = id;
		studentName = name;
		studentAddress = "�ּҾ���";
	}
	
	public void showStudentInfo() {
		System.out.println(studentName + ',' + studentAddress);
	}
}