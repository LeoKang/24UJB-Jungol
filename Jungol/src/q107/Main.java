package q107;

public class Main {
	public static void main(String[] args) {
		testFunction2();
	}

	public static void testFunction2() {
		float value_00 = 80.50f;
		float value_01 = 22.34f;
		float value_02 = value_00 + value_01;

		String[] result = new String[3];

		result[0] = String.format("%.2f", value_00);
		result[1] = String.format("%.2f", value_01);
		result[2] = String.format("%.2f", value_02);

		String output = "";
		int inum = 10;
		for (int i = 0; i < result.length; ++i) {
			int icnt = 0;
			for (int j = 0; j < inum; ++j) {
				if (inum - j <= result[i].length()) {
					output += result[i].charAt(icnt++);
					continue;
				}

				output += ' ';
			}
		}

		System.out.printf(output);
	}
}