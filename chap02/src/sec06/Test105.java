package sec06;

public class Test105 {

	public static void main(String[] args) {
		whoIsIt("참새");
		whoIsIt("고등어");
		whoIsIt("곰팡이");

	}

	static void whoIsIt(String bio) {
		String kindString = switch (bio) {
		case "호랑이", "사자":
			yield "포유류";
		case "독수리", "참새":
			yield "조류";
		case "고등어", "연어":
			yield "어류";
		default: {
			System.out.print("어이쿠!");
			yield "...";

		}
		};
		System.out.printf("%s는 %s이다.\n", bio, kindString);
	}
}