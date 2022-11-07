package sec03;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatterDemo {

	public static void main(String[] args) {
		ZonedDateTime date = ZonedDateTime.of(LocalDateTime.of(2022, 10, 25, 11, 20), ZoneId.of("Asia/Seoul"));
		DateTimeFormatter fm1 = DateTimeFormatter.ofPattern("yy-m-d");
		DateTimeFormatter fm2 = DateTimeFormatter.ofPattern("yy-m-d, H:m:s");
		DateTimeFormatter fm3 = DateTimeFormatter.ofPattern("yy-m-d, HH:mm:ss VV");
		DateTimeFormatter fm4 = DateTimeFormatter.ofPattern("yy-m-d, HH:mm:ss E");
		DateTimeFormatter fm5 = DateTimeFormatter.ofPattern("yyyy년 MM월 dd일 E요일");

		System.out.println(date.format(fm1));
		System.out.println(date.format(fm2));
		System.out.println(date.format(fm3));
		System.out.println(date.format(fm4));
		System.out.println(date.format(fm5));

		// LocalDateTime now = LocalDate Time.now();
		// DateTimeFormatter fm6 = DateTimeFormatter.ofPattern()

	}

}
