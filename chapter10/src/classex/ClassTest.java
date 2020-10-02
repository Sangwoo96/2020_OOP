package classex;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ClassTest {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
		
		//인스턴스 생성,  person 타입이 local에 있을 경우
		Person person = new Person("Haha");
		System.out.println(person);
		
		
		//동적 생성
		//default constructor 생성
		Class c1 = Class.forName("classex.Person");
		Person person1 = (Person)c1.newInstance();
		System.out.println(person1);
		
		//매개변수가 있는 constructor 생성
		Class[] parameterTypes = {String.class};
		Constructor cons = c1.getConstructor(parameterTypes);
		Object[] initargs = {"김유신"};
		Person person2 = (Person)cons.newInstance(initargs);
		System.out.println(person2);
	}

}
