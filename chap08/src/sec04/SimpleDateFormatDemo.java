package sec04;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class SimpleDateFormatDemo {

	public static void main(String[] args) {
		Date d = new Date();

		SimpleDateFormat sdf1 = new SimpleDateFormat("E yyyy.MM.dd 'at' hh:mm:ss a z");
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd");

		try {
			d = sdf2.parse("2022-10-25");
		} catch (ParseException e) {
			e.printStackTrace();
		}

		System.out.println(sdf1.format(d));
		System.out.println(sdf2.format(d));

		Calendar c = Calendar.getInstance();

		SimpleDateFormat sdf3 = new SimpleDateFormat("E yyyy.MM.dd", Locale.US);
		System.out.println(sdf3.format(c.getTime()));

		SimpleDateFormat sdf4 = new SimpleDateFormat("E yyyy.MM.dd", Locale.KOREA);
		System.out.println(sdf4.format(c.getTime()));

		LocalDateTime lt = LocalDateTime.now();
		DateTimeFormatter dt = DateTimeFormatter.ofPattern("E yyyy.MM.dd");

		System.out.println(lt.format(dt));
		System.out.println(dt.format(lt));

		try {
			d = sdf2.parse("2023-11-30");
		} catch (ParseException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
			System.out.println(e.toString());
		}

	}

}
