package classpart;

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student studentLee = new Student(1, "이순신", "서울"); 
//		studentLee.studentName = "이순신";
//		studentLee.address = "서울";
		
		studentLee.showStudentInfo();
		
		Student studentKim = new Student(2, "김유신");
//		studentKim.studentName = "김유신";
//		studentKim.address = "경주";
		
		studentKim.showStudentInfo();
		System.out.println(studentLee); //packagename.Class@stack의 참조변수에서 가르키는 heap의 주소
		System.out.println(studentKim);
		
		Human person = new Human();
		person.age = 40;
		person.child = 3;
		person.married = true;
		person.name = "person";
		person.getHumanInfo();
	}

}
