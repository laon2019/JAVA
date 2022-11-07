package sec03;

import java.util.HashSet;

public class HowHashCode {

	public static void main(String[] args) {
		HashSet<Car> cset = new HashSet<>();
		cset.add(new Car("HY_MD_301", "RED"));
		cset.add(new Car("HY_MD_303", "RED"));
		cset.add(new Car("HY_MD_303", "검정"));
		cset.add(new Car("HY_MD_301", "검정"));
		cset.add(new Car("HY_MD_302", "파랑"));
		cset.add(new Car("HY_MD_303", "회색"));
		System.out.println("인스턴스의 수 : " + cset.size());
		System.out.println(cset);
		for (Car c : cset) {
			System.out.println(c);
		}
	}
}
