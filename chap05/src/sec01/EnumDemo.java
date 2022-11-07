package sec01;

public class EnumDemo {

	public static void main(String[] args) {
		Gender gender = Gender.FEMALE;
		if (gender == gender.MALE) {
			System.out.println(gender.MALE + "은 병역 의무가 있다.");
		} else {
			System.out.println(gender.FEMALE + "은 병역 의무가 있다.");
		}

	}

}

enum Gender {
	MALE, FEMALE;
}
