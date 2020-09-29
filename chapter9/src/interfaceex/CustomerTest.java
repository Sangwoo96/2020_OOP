package interfaceex;

public class CustomerTest {

	public static void main(String[] args) {
		Customer customer = new Customer();
		customer.buy();
		customer.sell();
		customer.order();
		
		Sell seller = new Customer();
		seller.order();
		
		Buy buyer = new Customer();
		buyer.order();
	}

}
