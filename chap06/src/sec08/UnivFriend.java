package sec08;

public class UnivFriend extends Friend {
	private String major;

	public UnivFriend(String name, String major, String phone) {
		super(name, phone);
		this.major = major;

	}

	public void showInfo() {
		super.showInfo();
		System.out.println("\n전공 : " + major);
	}
}
