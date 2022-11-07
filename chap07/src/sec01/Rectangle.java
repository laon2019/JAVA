package sec01;

public class Rectangle extends Shpae {
	int x;
	int y;

	Rectangle(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public void draw() {
		System.out.println("사각형을 그리다.");
	}

	public double findArea() {
		return x * y;
	}
}
