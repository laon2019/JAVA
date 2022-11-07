package sec06;

public class BoundWildcardBase {

	public static void main(String[] args) {
		Box<Toy> box = new Box<>();
		// Toy toy = new Toy();
		BoxHandler.inBox(box, new Toy());
		BoxHandler.outBox(box);

		Box<Robot> rBox = new Box<>();
//		BoxHandler.inBox(rbox, new Toy());
//		BoxHandler.outBox(rbox);
		BoxHandler.inBox3(rBox, new Robot());
		BoxHandler.outBox3(rBox);
	}

}
