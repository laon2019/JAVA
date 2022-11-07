package sec04;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ObjectOutput {
	public static void main(String[] args) {
		SBox box1 = new SBox("Q", "1234");
		SBox box2 = new SBox("W", "1234");

		try (ObjectOutputStream o = new ObjectOutputStream(new FileOutputStream("Object.bin"))) {
			o.writeObject(box1);
			o.writeObject(box2);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
