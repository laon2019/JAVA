package Test06;

public class Person {
	String name;
	int age;

	Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	String getName() {
		return name;
	}

	int getAge() {
		return age;
	}

	void setName() {
		this.name = name;
	}

	void setAge() {
		this.age = age;
	}

	void show() {
		System.out.println("사람 [이름 : " + name + ", 나이 : " + age + "]");
	}
}
