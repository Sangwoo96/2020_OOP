package reference;

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student studentLee = new Student(100, "Lee");
		Student studentKim = new Student(101, "Kim");
		
		studentLee.setKoreasubject("����1", 50);
		studentLee.setMathSubject("����1", 80);
		
		studentKim.setKoreasubject("����2", 90);
		studentKim.setMathSubject("����2", 75);
		
		studentLee.getStudentInfo();
		studentKim.getStudentInfo();
	}

}
