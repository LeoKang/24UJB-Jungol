package q1341;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int s = sc.nextInt();
		int e = sc.nextInt();
		sc.close();

		if (s >= e) {
			for (int i = s; i >= e; i--) {
				for (int j = 1; j <= 9; j++) {
					System.out.print(i + " * " + j + " = ");
					System.out.printf("%2d   ", i * j);

					if (j % 3 == 0) {
						System.out.println();
					}
				}
				System.out.println();
			}
		} else {
			for (int i = s; i <= e; i++) {
				for (int j = 1; j <= 9; j++) {
					System.out.print(i + " * " + j + " = ");
					System.out.printf("%2d   ", i * j);

					if (j % 3 == 0) {
						System.out.println();
					}
				}
				System.out.println();
			}
			System.out.println();
		}
	}
}
