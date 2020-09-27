package polymorphism;

public class GoldCustomer extends Customer{
	
	private double salesRatio;
	
	public GoldCustomer(int cutomerID, String customerName) {
		super(cutomerID, customerName);
		customerGrade = "GOLD";
		bonusRatio = 0.02;
		salesRatio = 0.1;
	}
	
	@Override
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price - (int)(price * salesRatio);
	}
	
}
