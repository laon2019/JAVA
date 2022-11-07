package Test06;

public class Smartphone extends Telephone {
	private String game;

	Smartphone(String owner, String game) {
		super(owner);
		this.game = game;
	}

	String getGame() {
		return game;
	}

	void setGame() {
		this.game = game;
	}

	void playGame() {
		System.out.println(owner + "이가 " + game + " 게임을 하는 중이다.");
	}
}
