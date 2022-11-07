package Test06;

public class Phone {
	protected String owner;

	Phone(String owner) {
		this.owner = owner;
	}

	String getOwner() {
		return owner;
	}

	void setOwner() {
		this.owner = owner;
	}

	void talk() {
		System.out.println(owner + "이가 통화 중이다.");
	}
}
