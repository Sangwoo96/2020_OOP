 package interfaceex;

public interface Calc {
	double PI = 3.14; //���
	int ERROR = -9999999;
	
	int add(int num1, int num2);
	int substract(int num1, int num2);
	int times(int num1, int num2);
	int divide(int num1, int num2);
	
	default void description() //�������̽����� �ڵ� ����
	{
		System.out.println("description");
	}
	
	static void total(int[] arr) {
		for(int i : arr) {
			System.out.println(i);
		}
	}
	
	
}
