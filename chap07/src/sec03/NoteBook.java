package sec03;

public class NoteBook extends Computer implements Portable {
	public void inMyBag() {
		System.out.println("가방에 넣은 노트북입니다.");
	}

	@Override
	public void turnOn() {
		System.out.println("노트북을 켠다");
	}

	public void turnOff() {
		System.out.println("노트북을끈다.");
	}

	public void repair() {
		System.out.println("노트북을 수리한다.");
	}

	public static void main(String[] args) {
		NoteBook n = new NoteBook();
		n.inMyBag();
		n.turnOff();
		n.turnOn();
		n.repair();
	}
}
