package inheritance;

public class CustomerTest {

	public static void main(String[] args) {
		Customer customerLee = new Customer(10010, "�̼���");
//		customerLee.setCustomerID(10010);
//		customerLee.setCustomerName("�̼���");
		customerLee.bonusPoint = 1000;
		customerLee.showCustomerInfo();
		System.out.println(customerLee .calcPrice(10000));
		
		VIPCustomer customerNam = new VIPCustomer(10020, "�����");
//		customerNam.setCustomerName("�����");
//		customerNam.setCustomerID(10020);
		customerNam.bonusPoint = 10000;
		customerNam.showCustomerInfo();
		System.out.println(customerNam.calcPrice(10000));

		Customer customerHa = new VIPCustomer(10300, "�ϻ��");
		customerHa.showCustomerInfo();
		System.out.println(customerHa.calcPrice(10000)); //���� �޼��� : �ν��Ͻ��� �޼��尡 ȣ��ȴ�(override �� �޼��常 ����)
	}

}
