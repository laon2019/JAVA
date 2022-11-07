package sec01;

public class StringDemo {

	public static void main(String[] args) {
		String s1 = "H1, Java!";
		String s2 = "H1, Java!";
		String s3 = new String("H1, Java!");
		String s4 = new String("H1, Java!");

		System.out.println("s1 == s2 -> " + (s1 == s2));
		System.out.println("s1 == s3 -> " + (s1 == s3));
		System.out.println("s3 == s4 -> " + (s3 == s4));

		s1 = s3;

		System.out.println("s1 == s3 -> " + (s1 == s3));
	}

}
