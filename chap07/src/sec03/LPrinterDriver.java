package sec03;

public class LPrinterDriver implements Printable {
	public void print(String doc) {
		System.out.println("From LG Printer");
		System.out.println(doc);
	}
}
