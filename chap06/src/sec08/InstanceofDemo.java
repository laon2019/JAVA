package sec08;

public class InstanceofDemo {

	public static void main(String[] args) {
		Student s = new Student();
		Person p = new Person();
		System.out.println(s instanceof Person);
		System.out.println(s instanceof Student);
		System.out.println(p instanceof Student);
		// System.out.println(student instanceof String);
		downcast(s);
	}

	static void downcast(Person person) {
		if (person instanceof Student) {
			Student s = (Student) person;
			System.out.println("ok, 하향타입변환");

		}
	}

}
