package Test;

public class MathScore implements Comparable<MathScore> {
	String name;
	int score;

	public MathScore(String name, int score) {
		this.name = name;
		this.score = score;
	}

	public String toString() {
		return name + ", " + score;
	}

	public int compareTo(MathScore e) {
		return score - e.score;
	}
}
