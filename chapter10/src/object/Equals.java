package object;

class Student{
	int num;
	String name;
	
	public Student(int num, String name) {
		this.num = num;
		this.name = name;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student) {
			Student std = (Student)obj;
			if(this.name == std.name) return true;
			else return false;
		}
		else return false;
	}

	@Override
	public int hashCode() {
		return num;
	}
	
	
	
}
public class Equals {
	public static void main(String[] args) {
		Student lee = new Student(100, "lee");
		Student kim = new Student(100, "lee");
		
		System.out.println(lee==kim); //�ּҰ� Ȯ��, equals�� ����
		System.out.println(lee.equals(kim));
		System.out.println(lee.hashCode());
		System.out.println(kim.hashCode());
	}
}
