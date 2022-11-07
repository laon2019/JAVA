package Test1;

public class Hotel {
	class Room {
		int num;
		String name;

		Room(int num, String name) {
			this.num = num;
			this.name = name;
		}
	}

	Room[] rooms = new Room[10];

	void add(int num, String name) {
		rooms[num - 1] = new Room(num, name);
	}

	void show() {
		for (Room a : rooms) {
			if (a != null) {
				System.out.println(a.num + "번 방을 " + a.name + "가 예약했습니다.");
			}
		}
	}
}
