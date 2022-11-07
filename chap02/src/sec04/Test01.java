package sec04;

public class Test01 {

	public static void main(String[] args) {
		BanckAccount yoon = new BanckAccount("12-34-89", "990990-9090990", 10000);
		BanckAccount park = new BanckAccount("33-55-09", "770088-5959007", 10000);
		yoon.deposit(5000);
		park.deposit(3000);

		yoon.withdraw(2000);
		park.withdraw(2000);

		yoon.checkMyBalance();
		park.checkMyBalance();
	}

}
