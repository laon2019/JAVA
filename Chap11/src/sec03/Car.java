package sec03;

public class Car {
	private String model;
	private String color;

	public Car(String model, String color) {
		this.model = model;
		this.color = color;
	}

	public String toString() {
		return "Car [model=" + model + ", color=" + color + "]";
	}

	public int hashCode() {
		return (model.hashCode() + color.hashCode()) / 2;
	}

	@Override
	public boolean equals(Object obj) {
		String m = ((Car) obj).model;
		String c = ((Car) obj).color;
		if (model.equals(m) && color.equals(c)) {
			return true;
		} else {
			return false;
		}

	}

}
