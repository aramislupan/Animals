package AnimalExercise;

public class Runner {
	public static void main(String[] args) {
		Bird pigeon = new Bird();
		
		pigeon.setKind("Fantail Pigeon");
		System.out.println(pigeon.getKind());
		
		pigeon.setName("Fred");
		System.out.println(pigeon.getName());
		pigeon.fly();
		pigeon.happy();
		pigeon.nest();
		System.out.println("\n");
		
		Lion pantheraLeo = new Lion();
		
		pantheraLeo.setSpecie("Transvaal Lion");
		System.out.println(pantheraLeo.getSpecie());
		
		pantheraLeo.setName("Simba");
		System.out.println(pantheraLeo.getName());
		pantheraLeo.noise();
		pantheraLeo.run();
		System.out.println("\n");
		
		Dog poodle = new Dog();
		
		poodle.setBreed("Miniature Poodle");
		System.out.println(poodle.getBreed());
		
		poodle.setName("Waffle");
		System.out.println(poodle.getName());
		poodle.bark();
		poodle.happy();
		poodle.noise();
		System.out.println("\n");
		
		Horse arabian = new Horse();
		
		arabian.setType("Egyptian Horse");
		System.out.println(arabian.getType());
		
		arabian.setName("Sherbert");
		System.out.println(arabian.getName());
		arabian.run();
		arabian.sad();
		arabian.noise();
		
	}

}
