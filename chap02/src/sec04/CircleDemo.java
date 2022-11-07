package sec04;

public class CircleDemo {

	public static void main(String[] args) {
		Circle3 myCircle = new Circle3(7.0);
		Circle3 yourCircle = new Circle3(3.0);

		System.out.println("원의 개수 : " + Circle3.numOfCircles);
		System.out.println("원의 개수 : " + yourCircle.numCircles);

	}

	void print() {
		System.out.println("인스턴스 메서드입니다.");
	}

}
