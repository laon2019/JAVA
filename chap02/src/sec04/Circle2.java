package sec04;

public class Circle2 {
	double radius;
	String color;

	public Circle2(double radius, String color) {
		this.radius = radius;
		this.color = color;
	}

	public Circle2(double radius) {
		this(radius, "ํ๋");
	}

	public Circle2(String color) {
		this(10.0, color);
	}

	public Circle2() {
		this(10.0, "๋นจ๊ฐ");
	}

	public char show() {
		System.out.println(radius + color);
		return 0;
	}
}
