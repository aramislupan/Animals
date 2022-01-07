package AnimalExercise;

public class Animal implements Actions, Feelings{
	private String name;
	private String age;
	private String colour;
	
	
	public void sleep() {
		
	}
	
	public void eat() {
		
	}

	public String getColour() {
		System.out.println(name + " colour is: ");
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public String getAge() {
		System.out.println(name + " age is: ");
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getName() {
		System.out.println("Animal name is: ");
		return name;
	}

	public void setName(String name) {
		
		this.name = name;
	}

	@Override
	public void run() {
		System.out.println(name + " is running fast!");
		
	}

	@Override
	public void hunt() {
		System.out.println(name + " is hungry and hunting!");
		
	}

	@Override
	public void fly() {
		System.out.println(name + " is flying away!");
		
	}

	@Override
	public void sad() {
		System.out.println(name + " is feeling sad");
		
	}

	@Override
	public void happy() {
		System.out.println(name + " is feeling happy!");
		
	}

	@Override
	public void angry() {
		System.out.println(name + " is really angry!");
		
	}

	@Override
	public void bark() {
		System.out.println(name + " is barking!");
		
	}
}
