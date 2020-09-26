package classpart;

public class Student{ 
	private int studentID; //멤버변수, 속성
	public String studentName;
	public String studentAddress;
	
	//Student 생성자 두 개, 매개변수가 다름 -> 오버로딩
	public Student(int id, String name, String address) {
		studentID = id;
		studentName = name;
		studentAddress = address;
	}
	
	public Student(int id, String name) {
		studentID = id;
		studentName = name;
		studentAddress = "주소없음";
	}
	
	public void showStudentInfo() {
		System.out.println(studentName + ',' + studentAddress);
	}
}
