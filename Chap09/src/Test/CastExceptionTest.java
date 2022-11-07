package Test;

public class CastExceptionTest {

	public static void main(String[] args) {
		Rectangle r = new Rectangle();
		try {
			casting(r);
		} catch (ClassCastException e) {
			System.out.println("에러지롱~");
		}

	}

	static void casting(Shape s) throws ClassCastException {
		Circle c = (Circle) s;
	}

}
