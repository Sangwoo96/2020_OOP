package staticex;

public class Student{
	
	private static int serialNum = 1000;
	private int studentID; //멤버변수, 속성
	public String studentName;
	public String studentAddress;
	
	public Student(String name) {		
		studentName = name;
		studentAddress = "주소없음";
		serialNum++;
		studentID = serialNum;
	}
	
	public void showStudentInfo() {
		System.out.println(studentName + ',' + studentAddress + ',' + studentID);
	}

	public static int getSerialNum() {
		int i =0; //지역변수 사용가능
		//studentID= 10; static 클래스 내에서는 static 변수만 사용가능, 인스턴스 변수 사용x
		return serialNum;
	}
	
}
