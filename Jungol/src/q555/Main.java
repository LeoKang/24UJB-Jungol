package q555;

import java.util.Scanner;

//substring()
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		sc.close();

		// 2nd
		for (int i = 0; i <= 18; i += 2) {
			System.out.print(input.substring(i, i + 1));
		}

//		System.out.print(input.substring(0, 1));
//		System.out.print(input.substring(2, 3));
//		System.out.print(input.substring(4, 5));
//		System.out.print(input.substring(6, 7));
//		System.out.print(input.substring(8, 9));
//		System.out.print(input.substring(10, 11));
//		System.out.print(input.substring(12, 13));
//		System.out.print(input.substring(14, 15));
//		System.out.print(input.substring(16, 17));
//		System.out.print(input.substring(18, 19));

//		for (int i = 0; i < input.length(); ++i) {
//			if (input.charAt(i) == ' ')
//				continue;
//
//			System.out.print(input.charAt(i));
//		}
//
//		System.out.println();
//		System.out.print(input.replaceAll(" ", ""));
	}
}