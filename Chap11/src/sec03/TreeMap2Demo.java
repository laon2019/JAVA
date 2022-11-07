package sec03;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

public class TreeMap2Demo {
	public static void main(String[] args) {
		TreeMap<Integer, String> map = new TreeMap<>(new AgeComparator());

		map.put(65, "kim");
		map.put(35, "Park");
		map.put(26, "Choi");
		map.put(45, "Lee");

		Set<Integer> ks = map.keySet();

		for (Integer n : ks) {
			System.out.print(n + "\t");
		}
		System.out.println();
		for (Integer n : ks) {
			System.out.print(map.get(n).toString() + "\t");
		}
		System.out.println();

		for (Iterator<Integer> itr = ks.iterator(); itr.hasNext();) {
			System.out.print(map.get(itr.next()) + "\t");
		}
		System.out.println();
	}
}
