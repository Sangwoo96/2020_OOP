package polymorphism;

public class CutomerTest {

	public static void main(String[] args) {
		Customer lee = new Customer(1000, "LEE");
		lee.setBonusPoint(1000);
		Customer nam = new GoldCustomer(1001, "NAM");
		nam.setBonusPoint(10000);
		Customer kim = new VIPCustomer(1002, "KIM");
		kim.setBonusPoint(100000);
		
		lee.calcPrice(1000);
		nam.calcPrice(1000);
		kim.calcPrice(1000);
		lee.showCustomerInfo();
		nam.showCustomerInfo();
		kim.showCustomerInfo();
	}

}
