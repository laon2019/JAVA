package sec01;

public class ObjectArgumentDemo {

	public static void main(String[] args) {
		Circle c1 = new Circle(10.0);
		Circle c2 = new Circle(10.0);

		zero(c1);
		System.out.println("원(c1)의 반지름 : " + c1.getRadius());
		double z;
		z = zero(c2.getRadius());
		c2.setRadius(z);
		System.out.println("원(c2)의 반지름 : " + c2.getRadius());

	}

	public static void zero(Circle c) {
		c.setRadius(0.0);
	}

	public static double zero(double d) {
		return 0;
	}

}
