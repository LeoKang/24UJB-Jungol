package q531;

import java.util.HashMap;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float input = sc.nextFloat();
		sc.close();

		HashMap<String, Float> map = new HashMap<String, Float>();

		/*
		 * map.put("Flyweight", 50.80f); map.put("Lightweight", 61.23f);
		 * map.put("Middleweight", 72.57f); map.put("Cruiserweight", 88.45f);
		 * map.put("Heavyweight", 0.0f);
		 */

		String[] name = { "Flyweight", "Lightweight", "Middleweight",
				"Cruiserweight", "Heavyweight" };
		float[] value = { 50.80f, 61.23f, 72.57f, 88.45f, 0f };

		for (int i = 0; i < name.length; ++i) {
			if (i >= name.length - 1) {
				System.out.println(name[i]);
				break;
			} else if (input <= value[i]) {
				System.out.println(name[i]);
				break;
			}
		}
	}
}