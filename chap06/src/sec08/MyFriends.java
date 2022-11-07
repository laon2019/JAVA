package sec08;

public class MyFriends {

	public static void main(String[] args) {
		Friend[] fr = new Friend[10];

//		UnivFriend[] ufrns = new UnivFriend[5];
//		CompFriend[] cfrns = new CompFriend[5];
//
		int cnt = 0;

		fr[cnt++] = new UnivFriend("kim", "컴퓨터과", "010-1111-2222");
		fr[cnt++] = new UnivFriend("Lee", "전기공학", "010-1112-2222");
		fr[cnt++] = new UnivFriend("Park", "화학공학", "010-1121-2222");

		fr[cnt++] = new CompFriend("kim", "영업", "010-1121-2222");
		fr[cnt++] = new CompFriend("Lee", "인사", "010-1121-2222");
		fr[cnt++] = new CompFriend("Park", "마케팅", "010-1121-2222");

		int sw = 0;
		for (int i = 0; i < cnt; i++) {
			if (fr[i] instanceof UnivFriend && sw == 0) {
				System.out.println("====================");
				sw++;
			}
			if (fr[i] instanceof CompFriend && sw == 1) {
				System.out.println("==================");
				sw++;
			}
			fr[i].showInfo();
			System.out.println();

		}

	}

}
