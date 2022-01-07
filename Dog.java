package AnimalExercise;

public class Dog extends Animal{
	private String breed;
	
	public String getBreed(){
		System.out.println("Dog Breed is:");
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}
	
	
	public void noise() {
		System.out.println("The " + breed + " is saying Woof!Woof!!");
	}
	
	
}
