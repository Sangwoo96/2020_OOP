package reference;

public class Student {
	int studentID;
	String studentName;
	
	Subject korea;
//	int koreaScore;  ���� Ŭ������ �������(����)
//	int mathScore;
//	int engScore;

	Subject math;
//	String KoreaName;
//	String mathName;
//	String engName;
	
	public Student(int ID, String name) {
		studentID = ID;
		studentName = name;
		korea = new Subject();
		math = new Subject();
	}
	
	public void setKoreasubject(String name, int score) {
		korea.subjectName = name;
		korea.subjectScore = score;
	}
	
	public void setMathSubject(String name, int score) {
		math.subjectName = name;
		math.subjectScore = score;
	}
	
	public void getStudentInfo() {
		System.out.println(studentID + " " + studentName + " " + korea.subjectName + " " + korea.subjectScore);
		System.out.println(studentID + " " + studentName + " " + math.subjectName + " " + math.subjectScore);
	}
}