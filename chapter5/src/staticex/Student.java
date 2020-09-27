package staticex;

public class Student{
	
	private static int serialNum = 1000;
	private int studentID; //�������, �Ӽ�
	public String studentName;
	public String studentAddress;
	
	public Student(String name) {		
		studentName = name;
		studentAddress = "�ּҾ���";
		serialNum++;
		studentID = serialNum;
	}
	
	public void showStudentInfo() {
		System.out.println(studentName + ',' + studentAddress + ',' + studentID);
	}

	public static int getSerialNum() {
		int i =0; //�������� ��밡��
		//studentID= 10; static Ŭ���� �������� static ������ ��밡��, �ν��Ͻ� ���� ���x
		return serialNum;
	}
	
}
