package q537;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int inp = scan.nextInt();
		scan.close();

//		System.out.println(inp);

		// 1. for loop
		int sum1 = 0;
		for (int i = 1; i <= inp; i++) {
			sum1 += i;
		}
		System.out.println(sum1);

		// 2. while loop
		int sum2 = 0;
		int j = 1;
		while (j <= inp) {
			sum2 += j++;
		}
		System.out.println(sum2);

		// 3. do ~ while loop
		int sum3 = 0;
		int k = 1;
		do {
			sum3 += k;
		} while (k++ < inp);
		System.out.println(sum3);
	}
}
