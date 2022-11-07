package sec03;

public class NullPointerCaseStudy {

	public static void main(String[] args) {
		ContInfo ci = new ContInfo("010-1234-1234", "Korea");
		Company cp = new Company("YaHo Co., Ltd.", ci);
		Friend frn = new Friend("LEE SU", cp);
		showCompAddr(frn);
	}

	private static void showCompAddr(Friend frn) {
		String addr = null;
//		if (frn != null) {
//			Company com = frn.getCmp();
//			if (com != null) {
//				ContInfo info = com.getcInfo();
//				if (info != null) {
//					addr = info.getAdrs();
//				}
//			}
//		}
//		if (addr != null) {
//			System.out.println(addr);
//		} else {
//			System.out.println("업소용");
//		}
		System.out.println(addr);
	}

}
