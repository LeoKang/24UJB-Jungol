package q560;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int ar[] = new int[10];
		for (int i = 0; i < ar.length; i++) {
			ar[i] = sc.nextInt();
		}
		sc.close();

		//print
		for (int i = 0; i < ar.length; i++) {
			System.out.print(ar[i] + " ");
		}
		System.out.println();
		
		//2nd case
		Arrays.sort(ar);
		
		for (int i = 0; i < ar.length; i++) {
			System.out.print(ar[i] + " ");
		}
		
		
		//1st case
//		int min = 1000;
////		min = Integer.MAX_VALUE;
//
//		for (int i = 0; i < ar.length; i++) {
//			if(min > ar[i]) {
//				min = ar[i];
//			}
//		}
//		System.out.println(min);
	}
}
