package sec01;

public class Rectangle implements Comparable<Rectangle> {
	private int width, height;

	public Rectangle(int width, int height) {
		super();
		this.width = width;
		this.height = height;
	}

	public int findArea() {
		return width * height;
	}

	public String toString() {
		return String.format("사각형[폭=%d, 높이=%d]", width, height);
	}

	@Override
	public int compareTo(Rectangle o) {
		return width - o.width;
	}

}
