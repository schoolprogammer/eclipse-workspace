package Lemur;

public class Lemurs extends Mammal{
	Mammal mammal = new Mammal();
	private String location = "Madagascar";
	private String fur;
	private String classification = "Prosimians";
	
	public String getLocation() {
		return location;
	}
	public String getFur(String fur) {
		this.fur = fur;
		return this.fur;
	}
	public String getClassification() {
		return classification;
	}
	
}
