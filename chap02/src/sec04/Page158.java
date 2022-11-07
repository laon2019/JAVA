package sec04;

class Printer {
	private int numOfPapers;
	private boolean duplex;

	public Printer(int numOfPaper, boolean duplex) {
		this.numOfPapers = numOfPaper;
		this.duplex = duplex;
	}

	public void print(int amount) {
		if (this.duplex == false) {
			if (numOfPapers == 0) {
				System.out.println("용지가없습니다.");
			} else if (amount > numOfPapers) {
				System.out.printf("단면으로 모두 출력하려면 용지가 %d매 부족합니다. %d장만 출력합니다.", amount - numOfPapers, numOfPapers);
				System.out.println();
				numOfPapers = 0;
			} else {
				numOfPapers -= amount;
				System.out.printf("단면으로 %d장 출력했습니다. 현재 %d장 남아 있습니다.\n", amount, numOfPapers);
			}
		} else {
			int duplexAmount;
			if (amount % 2 == 0) {
				duplexAmount = amount / 2;
			} else {
				duplexAmount = amount / 2 + 1;
			} // 양면 출력일 경우 필요한 용지 매수 계산
			if (numOfPapers == 0) {
				System.out.println("용지가 없습니다.");
			} else if (duplexAmount > numOfPapers) {
				System.out.printf("양면으로 모두 출력하려면 용지가 %d매 부족합니다. %d만 출력합니다.\n", duplexAmount - numOfPapers, numOfPapers);
				numOfPapers = 0;
			} else {
				numOfPapers -= duplexAmount;
				System.out.printf("양면으로 %d장 출력했습니다. 현재 %d장 남아 있습니다.\n", duplexAmount, numOfPapers);
			}
		}
	}

	public boolean getDuplex() {
		return duplex;
	}

	public void setDuplex(boolean duplex) {
		this.duplex = duplex;
	}
}

public class Page158 {

	public static void main(String[] args) {
		Printer p = new Printer(20, true);
		p.print(25);
		p.setDuplex(false);
		p.print(10);

	}

}
