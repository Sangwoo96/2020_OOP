package cooperation;

public class TakeTransTest {

	public static void main(String[] args) {
		Student student1 = new Student("nam", 10000);
		Bus bus1 = new Bus(1);
		
		student1.takeBus(bus1);
		
		student1.showStudentInfo();
		bus1.showBusInfo();
	}
}
