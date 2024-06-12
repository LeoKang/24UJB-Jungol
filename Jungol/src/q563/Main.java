package q563;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] ar = new int[10];
		for (int i = 0; i < ar.length; i++) {
			ar[i] = sc.nextInt();
		}
		sc.close();

		for (int i = 0; i < ar.length; i++) {
			System.out.print(ar[i] + " ");
		}

		for (int i = 0; i < ar.length; i++) {
			int max = -1;
			int idx = -1;
			for (int j = 0; j < ar.length; j++) {
				if(max < ar[j]) {
					max = ar[j];
					idx = j;
				}
			}
			System.out.print(max + " ");
			ar[idx] = -1;
		}
	}
}
