package AnimalExercise;

public class Bird extends Animal{
	private String kind;
	
	
	public String getKind(){
		System.out.println("Bird kind is:");
		return kind;
	}

	public void setKind(String kind) {
		this.kind = kind;
	}
	
	public void nest() {
		System.out.println("The" + kind + " is building a nest!");
	}
}
