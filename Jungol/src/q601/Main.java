package q601;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String inp = sc.next();
		sc.close();

		System.out.println(inp);

		for (int i = 1; i <= inp.length(); i++) {
			for (int j = inp.length() - i; j < inp.length(); j++) {
				System.out.print(inp.charAt(j));
			}
			for (int j = 0; j < inp.length() - i; j++) {
				System.out.print(inp.charAt(j));
			}
			System.out.println();
		}
	}
}
