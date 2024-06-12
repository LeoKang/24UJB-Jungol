package q133;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] ar = new int[n];
		for (int i = 0; i < ar.length; i++) {
			ar[i] = sc.nextInt();
		}
		sc.close();

		// 1. print
//		System.out.println(n);
//		for (int i = 0; i < ar.length; i++) {
//			System.out.print(ar[i] + " ");
//		}

		int sum = 0;
		for (int i = 0; i < ar.length; i++) {
			sum += ar[i];
		}
		System.out.printf("%.2f\n", (double)sum / n);
	}
}
