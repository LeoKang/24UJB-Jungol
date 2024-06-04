package q562;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] inp = new int[10];
		for (int i = 0; i < inp.length; i++) {
			inp[i] = sc.nextInt();
		}
		sc.close();

		for (int i = 0; i < inp.length; i++) {
			System.out.print(inp[i] + " ");
		}
		System.out.println();

		int sumOdd = 0, sumEven = 0;
		for (int i = 0; i < inp.length; i++) {
			if(i % 2 == 0) {
				sumOdd += inp[i];
			}else {
				sumEven += inp[i];
			}
		}
		System.out.println("sum : " + sumEven);
		System.out.printf("avg : %.1f\n", sumOdd / 5.0);
	}

}
