package thisex;

public class Person {
	private String name;
	private int age;
	
	public Person(){
		this("�̸�����", 1);
	}
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void showPersonInfo() {
		System.out.println(name + " " + age);
	}
}