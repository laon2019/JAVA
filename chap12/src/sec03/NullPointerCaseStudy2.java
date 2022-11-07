package sec03;

import java.util.Optional;

public class NullPointerCaseStudy2 {

	public static void main(String[] args) {
		ContInfo ci = new ContInfo("010-1234-1234", "Korea");
		Company cp = new Company("YaHo Co., Ltd.", ci);
		Friend frn = new Friend("LEE SU", cp);
		showCompAddr(Optional.of(frn));
	}

	private static void showCompAddr(Optional<Friend> frn) {
		String addr = frn.map(Friend::getCmp).map(Company::getcInfo).map(ContInfo::getAdrs).orElse("주소가 없어요.");
		System.out.println(addr);
	}

}
