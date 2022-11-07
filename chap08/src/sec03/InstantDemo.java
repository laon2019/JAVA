package sec03;

import java.time.Duration;
import java.time.Instant;

public class InstantDemo {

	public static void main(String[] args) {
		Instant start = Instant.now();
		System.out.println("시작시각 : " + start.getEpochSecond());
		for (int i = 0; i < 389348; i++) {

		}
		System.out.println("Time flies like an arrow.");
		Instant end = Instant.now();
		System.out.println("마침시각 : " + end.getEpochSecond());

		Duration between = Duration.between(start, end);
		System.out.println("시각차(밀리초) : " + between.toMillis());

	}

}
