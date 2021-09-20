package ds.intro;

import java.util.Scanner;

public class Fibonacci {

	private static Scanner sn;

	public static void main(String[] args) {
		sn = new Scanner(System.in);
		int j = sn.nextInt();
		int[] fibo = new int[j];
		int i;
		for(i=0; i<j; i++) {
			if(i<=1) fibo[i]=i;
			else {
				fibo[i] = fibo[i-1] + fibo[i-2];
			}
			if(i==j-1)
			System.out.println(fibo[i]);
		}

	}

}
