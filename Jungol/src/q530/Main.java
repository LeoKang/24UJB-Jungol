package q530;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		int b = a.nextInt();
		a.close();

		int c = 20 - b;

		if (b >= 20) {
			System.out.println("adult");
		} else {
			System.out.println(c + " years later");
		}
	}
}