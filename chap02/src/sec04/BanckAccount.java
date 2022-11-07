package sec04;

public class BanckAccount {
	String accNumber; // 계좌번호
	String ssNumber; // 주민번호
	int balance; // 예금잔액

	public BanckAccount(String acc, String ss, int ball) {
		accNumber = acc;
		ssNumber = ss;
		balance = ball;
	}

	public BanckAccount() {
	}

	public int deposit(int amount) {
		balance += amount;
		return balance;
	}

	public int withdraw(int amount) {
		balance -= amount;
		return balance;
	}

	public int checkMyBalance() {
		System.out.println("계좌번호: " + accNumber);
		System.out.println("주민번호: " + ssNumber);
		System.out.println("예금잔액: " + balance + "\n");
		return balance;
	}

}
