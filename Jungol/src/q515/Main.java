package q515;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		System.out.println("");
		Scanner a = new Scanner(System.in);
		int b = a.nextInt();
		int c = a.nextInt();
		int d = a.nextInt();
		a.close();

		// System.out.println(b + " + " + c +" = " + d);
		System.out.printf("%d + %d = %d", b, c, d);
	}
}
