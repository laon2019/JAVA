package sec04;

import sec03.Computer;
import sec03.Controllable;
import sec03.TV;

public class ControllableDemo {

	public static void main(String[] args) {
//		Controllable[] controllable = { new TV(), new Computer(), new NoteBook() };
//		for (Controllable c : controllable) {
//			c.turnOn();
//			c.turnOff();
//			c.repair();
		TV t = new TV();
		Computer c = new Computer();

		controll(t);
		controll(c);
	}
//		Controllable.reset();

	static void controll(Controllable b) {
		b.turnOn();
		b.turnOff();
		b.repair();
	}
}
