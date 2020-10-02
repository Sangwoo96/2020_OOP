package string;

public class StringTest {

	public static void main(String[] args) {
		String str1 = new String("abc");
		String str2 = new String("abc");
		System.out.println(str1 == str2); //두 인스턴스의 주소값이 다름
		System.out.println(str1.equals(str2));
		
		String str3 = "abc";
		String str4 = "abc";
		System.out.println(str3 == str4); //값은 주소의 상수풀을 가르킴
		System.out.println(str3.equals(str4));
	}

}
