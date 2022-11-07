package Test06;

public class Telephone extends Phone {
	private String when;

	Telephone(String owner, String when) {
		super(owner);
		this.when = when;
	}

	Telephone(String owner) {
		super(owner);
	}

	String getWhen() {
		return when;
	}

	void setWhen() {
		this.when = when;
	}

	void autoAnswering() {
		System.out.println(owner + "가 없다. " + when + " 전화 줄래.");
	}
}
