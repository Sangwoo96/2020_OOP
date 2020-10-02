package generic;

public class Plastic extends Materials{
	public String toString() {
		return "재료는 플라스틱입니다.";
	}

	@Override
	public void doPrinting() {
		System.out.println("plastic printing");
	}
}
