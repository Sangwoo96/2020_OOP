package cooperation;

public class Bus {
	private int busNumber;
	private int passengerCount;
	private int money;
	
	public Bus(int busNumber) {
		this.busNumber = busNumber;
	}
	
	public void take(int money) {
		this.money += money;
		this.passengerCount += 1;
	}
	
	public void showBusInfo() {
		System.out.println(busNumber + " " + money + " " + passengerCount);
	}
}
