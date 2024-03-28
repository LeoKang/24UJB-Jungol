package q533;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char c = sc.next().charAt(0);
		int age = sc.nextInt();
		sc.close();

//		System.out.println(c);
//		System.out.println(age);

		// 2.
		if (c == 'M' && age < 18) {
			System.out.println("BOY");
		} else if (c == 'M' && age >= 18) {
			System.out.println("MAN");
		} else if (c == 'F' && age < 18) {
			System.out.println("GIRL");
		} else if (c == 'F' && age >= 18) {
			System.out.println("Woman");
		}

		// 1.
//		if (age >= 18) {
//			if (c == 'M') {
//				System.out.println("MAN");
//			} else {
//				System.out.println("WOMAN");
//			}
//		} else {
//			if (c == 'M') {
//				System.out.println("BOY");
//			} else {
//				System.out.println("GIRL");
//			}
//		}
	}
}
