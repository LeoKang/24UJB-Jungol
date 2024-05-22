package q129;

import java.util.Scanner;

public class Main {
	private static Scanner sc = new Scanner(System.in);
	
	public static char area() {	
		System.out.print("Base = ");
		int base = sc.nextInt();
		System.out.print("Height = ");
		int height = sc.nextInt();
		System.out.printf("Triangle width = %.1f\n", (double) base * height / 2);
		System.out.print("Continue? ");
		char c = sc.next().charAt(0);
		
		return c;
	}
	
	public static void main(String[] args) {
		char c = '\0';

		do {
			c = area();
		} while (c == 'Y' || c == 'y');
		sc.close();
	}
}
