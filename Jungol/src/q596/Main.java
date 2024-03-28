package q596;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		int len = sc.nextInt();
		sc.close();

//		System.out.println(str);
//		System.out.println(len);
//
//		System.out.println(str.length());

		if(str.length() > len) {
			for (int i = str.length() - 1, cnt = 0; len > cnt; i--, cnt++) {
				System.out.print(str.charAt(i));
			}
		}else {
			for (int i = str.length() - 1; i >= 0; i--) {
				System.out.print(str.charAt(i));
			}
		}
	}
}
