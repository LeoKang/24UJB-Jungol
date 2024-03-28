package q125;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int inp = sc.nextInt();
		sc.close();

		System.out.println(inp);

		// 1. for loop
		for (int i = 1; i <= inp; i++) {
			System.out.print(i + " ");
		}
		System.out.println();

		// 2. while loop
		int j = 1;
		while (j <= inp) {
			System.out.print(j++ + " ");
		}
		System.out.println();
		
		// 3. do ~ while loop
		int k = 1;
		do {
			System.out.print(k + " ");
		}while(k++ < inp);
	}
}
