package Test;

public class EnglishScore implements Comparable<EnglishScore> {
	String name;
	int score;

	public EnglishScore(String name, int score) {
		this.name = name;
		this.score = score;
	}

	public String toString() {
		return name + ", " + score;
	}

	public int compareTo(EnglishScore e) {
		return score - e.score;
	}
}
