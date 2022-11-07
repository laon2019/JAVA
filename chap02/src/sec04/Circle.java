package sec04;

public class Circle {

	int balance;

	public int deposit(int amount) {
		balance += amount;
		return balance;
	}

	public int withdraw(int amount) {
		balance -= amount;
		return balance;
	}

	public int checkMyBalance() {
		System.out.println("잔액 : " + balance);
		return balance;
	}
}
