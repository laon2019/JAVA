package sec04;

public class BanckAccountDemo {

	public static void main(String[] args) {
		Circle kim = new Circle();

		kim.deposit(50000);
		kim.withdraw(10000);
		kim.checkMyBalance();

		Circle lee = new Circle();
		lee.deposit(10000);
		lee.withdraw(2000);
		lee.checkMyBalance();
	}

}
