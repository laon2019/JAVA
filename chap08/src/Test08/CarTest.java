package Test08;

import java.text.MessageFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.StringTokenizer;

public class CarTest {

	public static void main(String[] args) {
		Car myCar = new Car("그랜저");
		Car yourCar = new Car("그랜저");
		if (myCar.equals(yourCar)) {
			System.out.println("자동차 모델이 둘 다 " + myCar + "로 동일하다.");
			Date d = new Date();
			SimpleDateFormat sdf1 = new SimpleDateFormat("MM-dd-YYYY");
			String s = MessageFormat.format("날짜: {0}, 자동차 모델 = {1}, 운전자{2}", sdf1.format(d), myCar, "(홍길동)");
			System.out.println(s);

			StringTokenizer st = new StringTokenizer(s, " ,=[]()");
			while (st.hasMoreTokens()) {
				System.out.println(st.nextToken());
			}
		} else {
			System.out.println("다르다");
		}
	}

}
