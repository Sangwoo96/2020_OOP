package hiding;

public class MyDate {
//	int day;
//	int month;
//	int year;  default ���� ������ -> ���� package ������ publicó�� ��� ����
	
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
