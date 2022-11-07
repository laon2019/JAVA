package Test1;

public class TV extends Controller {
	TV(boolean power) {
		super(power);
	}

	public void show() {
		System.out.println("TV가 꺼졌습니다.");
	}

	String getName() {
		return "TV";
	}
}
