package q126;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int inp = 0, odd = 0, even = 0;
		do {
			inp = sc.nextInt();
			if (inp == 0) {
				break;
			} else if (inp % 2 == 0) {
				even++;
			} else {
				odd++;
			}
		} while (inp != 0);
		sc.close();

		System.out.println("odd : " + odd);
		System.out.println("even : " + even);
	}
}
