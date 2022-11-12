package baekjoon;

import java.util.Scanner;

public class Test10870 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int[] arr = new int[n+1];
		
		if(n<=1) {
			System.out.println(n);
		}else {
			
			arr[0] = 0;
			arr[1] = 1;
			for(int i=0; i<n-1; i++) {
				arr[i+2] = arr[i] + arr[i+1];
			}
			System.out.println(arr[n]);
		}
	}
}
