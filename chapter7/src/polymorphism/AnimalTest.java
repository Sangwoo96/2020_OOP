package polymorphism;

import java.util.ArrayList;

class Animal{
	public void move() {
		System.out.println("������ �����Դϴ�.");
	}
}


class Human extends Animal{
	@Override
	public void move() {
		System.out.println("����� �ι߷� �Ƚ��ϴ�.");
	}
	
	public void readBook() {
		System.out.println("����� å�� �н��ϴ�.");
	}
}

class Tiger extends Animal{
	@Override
	public void move() {
		System.out.println("ȣ���̰� �� �߷� �ݴϴ�.");
	}
	
	public void hunting() {
		System.out.println("ȣ���̰� ����� �մϴ�.");
	}
}

class Eagle extends Animal{
	@Override
	public void move() {
		System.out.println("�������� �ϴ��� ���ư��ϴ�.");
	}
	public void flying() {
		System.out.println("�������� ���ư��ϴ�.");
	}
}

public class AnimalTest {

	public static void main(String[] args) {
		Animal hAnimal = new Human();
		Animal tAnimal = new Tiger();
		Animal eAnimal = new Eagle();
		
		hAnimal.move(); //����
		//hAnimal.readBook(); �Ұ���
		
		Human human = (Human)hAnimal; //�ٿ�ĳ����
		human.readBook(); //����
		
		//Eagle eagle = (Eagle)hAnimal; ���� : �ν��Ͻ��� Ÿ���� �ٸ�
		if(hAnimal instanceof Human){
			Human human2 = (Human)hAnimal; //�ٿ�ĳ����
			human2.readBook(); //����
		}
		
		
		AnimalTest test = new AnimalTest();
		test.moveAnimal(hAnimal);
		test.moveAnimal(tAnimal);
		test.moveAnimal(eAnimal);
		
		ArrayList<Animal> animalList = new ArrayList<Animal>();
		animalList.add(hAnimal);
		animalList.add(tAnimal);
		animalList.add(eAnimal);
		
		for(Animal a : animalList) {
			a.move();
		}
	}
	
	public void moveAnimal(Animal animal) {
		animal.move();
	}

}
