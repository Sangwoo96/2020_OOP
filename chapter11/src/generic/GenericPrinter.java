package generic;

public class GenericPrinter<T extends Materials> {
	private T materials;

	public T getMaterials() {
		return materials;
	}

	public void setMaterials(T materials) {
		this.materials = materials;
	}
	
	public String toString() {
		return materials.toString();
	}
	
	public void printing() {
		materials.doPrinting();
	}
}
