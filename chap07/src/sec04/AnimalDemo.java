package sec04;

public class AnimalDemo {

	public static void main(String[] args) {
		Animal[] animal = { new Dog(), new Cuckoo() };

		for (Animal a : animal) {
			a.sound();
		}
//		Dog d = new Dog();
//		Cuckoo c = new Cuckoo();
//		
//		makeSound(d);
//		makeSound(c);

	}
//	static void makeSound(Animal a) {
//		a.sound();
//	}

}
