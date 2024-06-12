package q1309;

import java.util.Scanner;

public class Main {
	public static long f(long p) {
		if (p == 1) {
//			System.out.println("1! = 1");
			return 1;
		} else {
//			System.out.println(p + "! = " + p + " * " + (p - 1) + "!");
			return p * f(p - 1);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		sc.close();

//		System.out.println(n);

		long ret = f(n);
		System.out.println(ret);
	}
}
