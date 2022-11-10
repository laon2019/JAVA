package Test;

import java.util.ArrayList;
import java.util.Scanner;

public class Student {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		ArrayList<Integer> score = new ArrayList<>();
		while(true) {
			System.out.print("점수를 입력하세요 : ");
			int x = in.nextInt();
			if(x<0) {
				break;
			} else {
				score.add(x);
			}
		}
		System.out.println("전체 학생은 "+score.size()+"이다");
		System.out.print("학생들의 성적 : ");
		for(int i : score) {
			System.out.print(i+" ");
		}
		System.out.println();
		int max=0;
		for(int k =0;k<score.size();k++) {
			if(max<score.get(k)) {
				max = score.get(k);
			}
		}
		for(int j=0;j<score.size();j++) {
			if(score.get(j)>= max-10) {
				System.out.println(j+1+"번 학생의 성적은 "+score.get(j)+"등급은 A이다");
			}else if(score.get(j)>= max-20) {
				System.out.println(j+1+"번 학생의 성적은 "+score.get(j)+"등급은 B이다");
			}else if(score.get(j)>= max-30) {
				System.out.println(j+1+"번 학생의 성적은 "+score.get(j)+"등급은 C이다");
			}
		}
		

	}

}
