package sec03;

import java.time.LocalDate;
import java.time.Period;

public class LocalDatePeriodDemo {

	public static void main(String[] args) {
		LocalDate today = LocalDate.now();
		System.out.println("오늘 : " + today);

		LocalDate xmas = LocalDate.of(today.getYear(), 12, 25);
		System.out.println("크리스마스 : " + xmas);

		Period left = Period.between(today, xmas);
		System.out.println("크리스마스까지 앞으로 : " + left);
		System.out.println("크리스마스까지 앞으로 : " + left.getMonths() + "월" + left.getDays() + "일");

		LocalDate exam = LocalDate.of(today.getYear(), 11, 17);
		System.out.println("올해의 수능 날짜 : " + exam);

		left = Period.between(today, exam);
		System.out.println("시험까지 앞으로 : " + left);
		System.out.println("시험까지 앞으로 : " + left.getMonths() + "월" + left.getDays() + "일");

	}

}
