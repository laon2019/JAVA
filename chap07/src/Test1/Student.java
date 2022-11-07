package Test1;

public class Student implements Human {
	int age;

	Student(int age) {
		this.age = age;
	}

	public void eat() {
		System.out.println("도시락을 먹습니다.");
	}

	public void print() {
		System.out.println(age + "세의 학생입니다.");
	}
}
