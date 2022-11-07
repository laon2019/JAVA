package Test06;

public class Student extends Person {
	int undergrad;

	Student(String name, int age, int undergrad) {
		super(name, age);
		this.undergrad = undergrad;
	}

	int getUndergrad() {
		return undergrad;
	}

	void setUndergrad() {
		this.undergrad = undergrad;
	}

	void show() {
		System.out.println("학생[이름 : " + name + ", 나이 : " + age + ", 학번 : " + undergrad + "]");
	}
}
