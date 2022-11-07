package Test06;

public class MovablePoint extends Point {
	private int xSpeed, ySpeed;

	MovablePoint(int x, int y, int xSpeed, int ySpeed) {
		super(x, y);
		this.xSpeed = xSpeed;
		this.ySpeed = ySpeed;

	}

	int getXSpeed() {
		return xSpeed;
	}

	int getYSpeed() {
		return ySpeed;
	}

	void setXSpeed() {
		this.xSpeed = xSpeed;
	}

	void setYSpeed() {
		this.ySpeed = ySpeed;
	}

	public String toString() {
		return "x : " + getX() + " y : " + getY() + " xSpeed : " + xSpeed + "ySpeed : " + ySpeed;
	}
}
