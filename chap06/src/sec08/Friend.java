package sec08;

public class Friend {
	private String name;
	private String phone;

	public Friend(String name, String phone) {
		this.name = name;
		this.phone = phone;
	}

	public void showInfo() {
		System.out.println("\n이름 : " + name + "\n전화번호 : " + phone);
	}
}
