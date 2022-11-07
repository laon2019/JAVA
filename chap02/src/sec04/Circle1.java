package sec04;

class Circle1 {
	private double radius;

	public double getRadius() {
		return radius;
	}

	public void setRadius(double r) {
		if (r >= 0)
			radius = r;
	}

	double findArea() {
		return 3.14 * radius * radius;
	}

	void show(double x, double y) {
		System.out.printf("반지름 = %.1f, 넓이 = %.1f\n", x, y);
	}
}
