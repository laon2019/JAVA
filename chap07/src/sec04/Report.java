package sec04;

public class Report implements Printable, Upper {
	String cons;

	Report(String cons) {
		this.cons = cons;
	}

	@Override
	public String getContents() {
		return cons;
	}

}
