package Test06;

public class Info {

	public static void main(String[] args) {
		Person[] person = new Person[3];
		person[0] = new Person("길동이", 22);
		person[1] = new Student("황진이", 23, 100);
		person[2] = new ForeignStudent("Amy", 30, 200, "U.S.A");

		for (Person p : person)
			p.show();
	}

}
