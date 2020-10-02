package classex;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ClassTest {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
		
		//�ν��Ͻ� ����,  person Ÿ���� local�� ���� ���
		Person person = new Person("Haha");
		System.out.println(person);
		
		
		//���� ����
		//default constructor ����
		Class c1 = Class.forName("classex.Person");
		Person person1 = (Person)c1.newInstance();
		System.out.println(person1);
		
		//�Ű������� �ִ� constructor ����
		Class[] parameterTypes = {String.class};
		Constructor cons = c1.getConstructor(parameterTypes);
		Object[] initargs = {"������"};
		Person person2 = (Person)cons.newInstance(initargs);
		System.out.println(person2);
	}

}
