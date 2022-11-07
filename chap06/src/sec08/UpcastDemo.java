package sec08;

public class UpcastDemo {

	public static void main(String[] args) {
		Person person;
		Student student = new Student();
		person = student;

		// p.number =1;
		// p.work();
		person.whoami();

	}

}
