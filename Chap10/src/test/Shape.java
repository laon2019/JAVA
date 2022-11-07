package test;

import java.util.ArrayList;
import java.util.List;

public class Shape {
	private String type;
	private String color;
	private Double area;

	public Shape(String type, String color, Double area) {
		this.type = type;
		this.color = color;
		this.area = area;
	}

	public String getType() {
		return type;
	}

	public String getColor() {
		return color;
	}

	public Double getArea() {
		return area;
	}

	public String toString() {
		return type + "(" + color + ", " + area + ")";
	}

	public static final List<Shape> shapes = new ArrayList<>(
			List.of(new Shape("삼각형", "빨간색", 10.5), new Shape("사각형", "파란색", 11.2), new Shape("원", "파란색", 16.5),
					new Shape("원", "빨간색", 5.3), new Shape("원", "노란색", 8.1), new Shape("사각형", "파란색", 20.7),
					new Shape("삼각형", "파란색", 3.4), new Shape("사각형", "빨간색", 12.6)));

}
