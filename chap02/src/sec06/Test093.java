package sec06;

public class Test093 {

	public static void main(String[] args) {
		int row = 1;
		while (row < 10) {
			int column = 2;
			while (column < 10) {
				System.out.printf("%2d * %2d = %2d|", column, row, row * column);
				column++;
			}
			System.out.println();
			row++;
		}

	}

}
