package Test;

import java.util.ArrayList;

public class ArrayTest {
	public static void main(String[] args) {
		ArrayList<String> s = new ArrayList<>();
		s.add("갈매기");
		s.add("나비");
		s.add("다람쥐");
		s.add("라마");
		for(String t : s) {
			if(t.length()==2) {
				System.out.println(t);
			}
		}
	}
}
