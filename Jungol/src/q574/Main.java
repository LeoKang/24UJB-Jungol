package q574;

import java.util.Scanner;

public class Main {
	public int sjMax(int n1, int n2, int n3) {
		int ret = 0;

		if (n1 < n2) {
			if (n2 < n3) {
				ret = n3;
			} else {
				ret = n2;
			}
		} else {
			if (n1 < n3) {
				ret = n3;
			} else {
				ret = n1;
			}
		}

		return ret;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		sc.close();

		System.out.println(num1 + " " + num2 + " " + num3);
		Main m = null;
		m = new Main();
		int r = m.sjMax(num1, num2, num3);
		System.out.println(r);
	}
}
