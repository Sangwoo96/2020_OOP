package hiding;

public class MyDate {
//	int day;
//	int month;
//	int year;  default 접근 제어자 -> 같은 package 내에서 public처럼 사용 가능
	
	private int day;
	private int month;
	private int year;
	
	private boolean invalid = true;
	
	public void setDay(int day) {
		this.day = day;
	}
	
	public void setMonth(int month) {
		if(month < 0 || month > 12 ) invalid = false;
		this.month = month;
	}
	
	public void setYear(int year) {
		this.year = year;
	}
	
	public void showMyDate() {
		if(invalid == false) System.out.println("fail");
		else System.out.println(day + " " + month + " " + year);
	}
}
