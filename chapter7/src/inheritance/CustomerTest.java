package inheritance;

public class CustomerTest {

	public static void main(String[] args) {
		Customer customerLee = new Customer(10010, "이순신");
//		customerLee.setCustomerID(10010);
//		customerLee.setCustomerName("이순신");
		customerLee.bonusPoint = 1000;
		customerLee.showCustomerInfo();
		System.out.println(customerLee .calcPrice(10000));
		
		VIPCustomer customerNam = new VIPCustomer(10020, "남상우");
//		customerNam.setCustomerName("남상우");
//		customerNam.setCustomerID(10020);
		customerNam.bonusPoint = 10000;
		customerNam.showCustomerInfo();
		System.out.println(customerNam.calcPrice(10000));

		Customer customerHa = new VIPCustomer(10300, "하상원");
		customerHa.showCustomerInfo();
		System.out.println(customerHa.calcPrice(10000)); //가상 메서드 : 인스턴스의 메서드가 호출된다(override 된 메서드만 가능)
	}

}
