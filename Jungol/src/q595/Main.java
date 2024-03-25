package q595;

public class Main {
	public static void main(String[] args) {
		String str = "Hong Gil Dong";
		System.out.println(str);

//		System.out.println(str.charAt(3));
//		System.out.println(str.charAt(4));
//		System.out.println(str.charAt(5));
//		System.out.println(str.charAt(6));

		for (int i = 3; i <= 6; i++) {
			System.out.print(str.charAt(i));
		}
		System.out.println("\n-----------------");
		
		System.out.println(str.substring(3, 7));
	}

}
