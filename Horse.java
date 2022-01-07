package AnimalExercise;

public class Horse extends Animal{
	private String type;
	
	public String getType(){
		System.out.println("Horse type is:");
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public void noise() {
		System.out.println("The " + type + " is saying Hreeeee!");
	}

}
