package Test08;

import java.text.MessageFormat;

public class MessageFormatTest {

	public static void main(String[] args) {
		Object[][] data = { { "세종대왕", 1, "조선" }, { "오바마 ", 2, "미국" }, { "징기스칸", 3, "몽고" } };
		System.out.println("번호\t이룸\t국적");
		System.out.println("-------------------");
		MessageFormat message = new MessageFormat(" {1}\t{0}\t{2}");
		for (int i = 0; i < data.length; i++) {
			System.out.println(message.format(data[i]));
		}

//		String s1 = MessageFormat.format("이름: {0}		번호 : {1}      국적 : {2}", data[0][0], data[0][1], data[0][2]);
//		String s2 = MessageFormat.format("이름: {0}      번호 : {1}      국적 : {2}", data[1][0], data[1][1], data[1][2]);
//		String s3 = MessageFormat.format("이름: {0}      번호 : {1}      국적 : {2}", data[2][0], data[2][1], data[2][2]);
//		System.out.println(s1);
//		System.out.println(s2);
//		System.out.println(s3);

	}

}
