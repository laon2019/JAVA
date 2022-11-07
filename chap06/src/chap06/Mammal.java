package chap06;

public class Mammal extends Animal {
	public Mammal() {
		super("원숭이");
		System.out.println("포유류 : 원숭이");
	}

	Mammal(String s) {
		super(s);
		System.out.println("포유류 : " + s);
	}
}
