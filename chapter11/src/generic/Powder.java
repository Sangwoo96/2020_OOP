package generic;

public class Powder extends Materials {
	public String toString() {
		return "재료는 파우더입니다";
	}

	@Override
	public void doPrinting() {
		System.out.println("powder printing");
	}
	
}
