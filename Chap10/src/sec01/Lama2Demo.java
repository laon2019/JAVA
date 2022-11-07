package sec01;

public class Lama2Demo {

	public static void main(String[] args) {
		Negative n;
		Printable p;

		n = (int x) -> {
			return -x;
		};
		n = (x) -> {
			return -x;
		};
		n = x -> {
			return -x;
		};
		n = (x) -> -x;
		n = x -> -x;

		n = new Negative() {

			@Override
			public int neg(int x) {
				// TODO Auto-generated method stub
				return 0;
			}

		};

		p = new Printable() {

			@Override
			public void print() {
				System.out.println("dfakj");

			}
		};
		p = () -> {
			System.out.println("dddd");
		};
		p = () -> System.out.println("dddd");
		p.print();
	}

}
