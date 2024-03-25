package q557;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		String[] ip = sc.nextLine().split(" ");
		String ip1 = sc.nextLine();
		String[] ip = ip1.split(" ");

		System.out.println(ip[0] + " " + ip[3] + " " + ip[6]);

		sc.close();
	}
}