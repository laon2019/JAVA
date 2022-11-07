package sec04;

public class GenericClass1Demo {

	public static void main(String[] args) {
		Cup<Beer> c = new Cup<>();
		c.setBeverage(new Beer());
		Beer b1 = c.getBeverage();

		Cup<Boricha> d = new Cup<>();
		d.setBeverage(new Boricha());
		Boricha b2 = d.getBeverage();
//		b1 = c.getBeverage();
//		b2 = d.getBeverage();

		System.out.println(b1);
		System.out.println(b2);

	}

}
