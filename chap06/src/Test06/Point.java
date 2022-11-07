package Test06;

public class Point {
	private int x, y;

	Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	int getX() {
		return x;
	}

	int getY() {
		return y;
	}

	void setX() {
		this.x = x;
	}

	void setY() {
		this.y = y;
	}

	public String toString() {
		return "x : " + x + " y : " + y;
	}
}
