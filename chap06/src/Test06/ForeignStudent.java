package Test06;

public class ForeignStudent extends Student {
	String nationality;

	ForeignStudent(String name, int age, int undergrad, String nationality) {
		super(name, age, undergrad);
		this.nationality = nationality;
	}

	String getNationality() {
		return nationality;
	}

	void setNationality() {
		this.nationality = nationality;
	}

	void show() {
		System.out.println("학생[이름 : " + name + ", 나이 : " + age + ", 학번 : " + undergrad + ",국적 : " + nationality + "]");
	}
}
