package sec06;

public class MemberDemo {
	Bird e = new Bird() {
		public void move() {
			System.out.println("독수리가 난다.");
		}

		public void sound() {
			System.out.println("휘익");
		}
	};

	public static void main(String[] args) {
		MemberDemo a = new MemberDemo();
		a.e.move();
		// a.e.sound();

	}

}
