package Test06;

public class Car extends Vehicle {
	static int displacement;
	static int gears;

	public Car(String color, int speed, int displacement, int gears) {
		super(color, speed);
		this.displacement = displacement;
		this.gears = gears;
	}

	static void show() {
		System.out.println(
				"color : " + color + ", speed : " + speed + ", displacement : " + displacement + ", gears : " + gears);
	}
}
