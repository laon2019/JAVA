package Test;

public class Box<T> {
	T a;

	public T get() {
		return a;
	}

	public void set(T a) {
		this.a = a;
	}
}
