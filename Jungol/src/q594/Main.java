package q594;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		String val;
		Scanner sc = new Scanner(System.in);
		val = sc.next();
		sc.close();
		System.out.println(val.repeat(2));
	}
}
