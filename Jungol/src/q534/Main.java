package q534;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char inp = sc.next().charAt(0);
		sc.close();

		System.out.println(inp);

		// case 2. switch ~ case
		String msg = "";
		switch(inp) {
		case 'A':
			msg = "Excellent";
			break;
		case 'B':
			msg = "Good";
			break;
		case 'C':
			msg = "Usually";
			break;
		case 'D':
			msg = "Effort";
			break;
		case 'F':
			msg = "Failure";
			break;
		default:
			msg = "error";
			break;
		}
		
		// case 1. if ~ else
//		String msg = "";
//		if (inp == 'A') {
//			msg = "Excellent";
//		} else if (inp == 'B') {
//			msg = "Good";
//		} else if (inp == 'C') {
//			msg = "Usually";
//		} else if (inp == 'D') {
//			msg = "Effort";
//		} else if (inp == 'F') {
//			msg = "Failure";
//		} else {
//			msg = "error";
//		}
		System.out.println(msg);
	}
}
