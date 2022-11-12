package baekjoon;

import java.util.Scanner;

public class Test10872 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		System.out.println(factorial(N));	
	}
	public static int factorial(int N) {
		int sum =1;
		for(int i=N; N>1; N--) {
			sum= sum * N;
		}
		return sum;
	}
}
