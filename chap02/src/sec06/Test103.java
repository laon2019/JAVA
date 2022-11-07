package sec06;

public class Test103 {

	public static void main(String[] args) {
		whoIsIt("호랑이");
		whoIsIt("참새");
		whoIsIt("고등어");
		whoIsIt("곰팡이");

	}

	static void whoIsIt(String bio) {
		String kindString;
		switch (bio) {
		case "호랑이":
		case "사자":
			kindString = "포유류";
			break;
		case "독수리":
		case "참새":
			kindString = "조류";
			break;
		case "고등어":
		case "연어":
			kindString = "어류";
			break;
		default:
			System.out.print("어이쿠!");
			kindString = "...";
		}
		System.out.printf("%s는 %s이다.\n", bio, kindString);
	}

}
