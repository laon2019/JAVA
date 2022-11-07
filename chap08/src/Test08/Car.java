package Test08;

public class Car {
	String name;

	public Car(String name) {
		this.name = name;
	}

	public String toString() {
		return "[" + name + "]";
	}

	public boolean equals(Object obj) {
		if (obj instanceof Car) {
			Car c = (Car) obj;
			if (name.equals(c.name))
				return true;
		}
		return false;
	}

}
