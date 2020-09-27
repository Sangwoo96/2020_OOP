package inheritance;

public class VIPCustomer extends Customer {
	
	private double salesRatio;
	private int agentID;
	
	public VIPCustomer(int cutomerID, String customerName) {
		super(cutomerID, customerName);
		customerGrade = "VIP";
		bonusRatio = 0.05;
		salesRatio = 0.1;
		System.out.println("VIP ������ ȣ��");
	}
	
	
	@Override
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price - (int)(price * salesRatio);
	}
}
