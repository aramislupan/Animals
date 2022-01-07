package AnimalExercise;

public class Lion extends Animal{
	private String specie;
/*	private boolean mammal = true;
	
	public boolean isMammal() {
		//System.out.println("Is" + specie + "a mammal?");
		return mammal;
	}

	public void setMammal(boolean mammal) {
		this.mammal = mammal;
	}
*/

	public String getSpecie(){
		System.out.println("Lion specie is: ");
		return specie;
	}

	public void setSpecie(String specie) {
		this.specie = specie;
	}
	
	public void noise() {
		System.out.println("The " + specie + " is saying Roarrrrr!");
	}
}
