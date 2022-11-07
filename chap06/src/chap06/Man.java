package chap06;

public class Man {
	String name;

	Man() {

	}

	Man(String name) {
		this.name = name;
	}

	public void tellYourName() {
		System.out.println("My name is " + name);
	}
}
