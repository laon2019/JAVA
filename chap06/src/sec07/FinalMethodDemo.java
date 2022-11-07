package sec07;

class Chess {
	enum ChessPlayer {
		WITE, BLACK
	}

	final ChessPlayer getFirstPlayer() {
		return ChessPlayer.WITE;
	}
}

class WorldChess extends Chess {
	// ChessPlayer getFirstPlayer(){}
}

public class FinalMethodDemo {

	public static void main(String[] args) {
		WorldChess worldChess = new WorldChess();
		worldChess.getFirstPlayer();

	}

}
