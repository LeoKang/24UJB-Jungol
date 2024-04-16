package q575;

import java.util.Scanner;

public class Main {
	public int sjpow(int p1, int p2) {
		int res = 1;

		for (int i = 0; i < p2; i++) {
			res *= p1;
		}

		return res;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		sc.close();

		System.out.println(n1 + " " + n2);

		Main main = new Main();
		int ret = main.sjpow(n1, n2);
		System.out.println(ret);
	}
}
