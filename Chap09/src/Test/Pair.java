package Test;

public class Pair<T extends Number> {
	T a;
	T b;

	public Pair(T a, T b) {
		this.a = a;
		this.b = b;
	}

	public T first() {
		return a;
	}

	public T second() {
		return b;
	}

}
