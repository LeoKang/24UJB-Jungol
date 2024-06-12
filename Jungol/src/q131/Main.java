package q131;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		sc.close();

		System.out.println(n1 + " " + n2);
		int min = Math.min(n1, n2);
		int max = Math.max(n1, n2);

		for (int i = min; i <= max; i++) {
			System.out.print(i + " ");
		}
	}
}
