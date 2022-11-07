package test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class ShapeTest {
	static List<Shape> findShapesByType(List<Shape> shapes, String type) {
		List<Shape> shape = new ArrayList<>();
		for (Shape s : shapes) {
			if (s.getType() == type) {
				shape.add(s);
			}
		}
		return shape;
	}

	static List<Shape> findShapesByColorNArea(List<Shape> shapes, String color, double area) {
		List<Shape> shape = new ArrayList<>();
		for (Shape s : shapes) {
			if (s.getColor() == color && s.getArea() <= area) {
				shape.add(s);

			}

		}
		return shape;

	}

	static List<Shape> findShapes(List<Shape> shapes, String type, String color, Double area) {
		List<Shape> shape = new ArrayList<>();
		for (Shape s : shapes) {
			if (s.getType() == type || s.getColor() == color && s.getArea() <= area) {
				shape.add(s);
			}
		}
		return shape;
	}

	static List<Shape> findShapes(List<Shape> shapes, Predicate<Shape> p) {
		List<Shape> shape = new ArrayList<>();
		for (Shape s : shapes) {
			if (p.test(s)) {
				shape.add(s);
			}
		}
		return shape;
	}

	public static void main(String[] args) {
		System.out.println("사각형 : " + findShapesByType(Shape.shapes, "사각형"));
		System.out.println("빨간 도형(면적<=12.0) : " + findShapesByColorNArea(Shape.shapes, "빨간색", 12.0));
		System.out.println("사각형 : " + findShapes(Shape.shapes, "사각형", null, null));
		System.out.println("빨간 도형(면적<=12.0) : " + findShapes(Shape.shapes, null, "빨간색", 12.0));
//		System.out.println("사각형 : " + findShapes(Shape.shapes, new Predicate<Shape>() {
//
//			@Override
//			public boolean test(Shape t) {
////				if (t.getType() == "사각형") {
////					return true;
////				} else {
////					return false;
////				}
//				return t.getType() == "사각형";
//			}
//
//		}));
		System.out.println("사각형 : " + findShapes(Shape.shapes, t -> t.getType() == "사각형"));
		System.out.println(
				"빨간 도형(면적<=12.0) : " + findShapes(Shape.shapes, t -> t.getColor() == "빨간색" && t.getArea() <= 12.0));
//		System.out.println("사각형, 빨간 도형(면적<=12.0) : " + findShapes(Shape.shapes, "사각형", "빨간색", 12.0));

	}

}
