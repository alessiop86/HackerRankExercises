package alessio.hackerrank.algorithms.search;

import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/icecream-parlor
 */

public class IceCreamParlor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for (int i = 0; i < t; i++) {
			int m = sc.nextInt();
			int n = sc.nextInt();

			int[] flavors = new int[n];
			for (int j = 0; j < n; j++) {
				flavors[j] = sc.nextInt();
			}

			print(m, flavors);
		}
		sc.close();
	}

	/**
	 * 
	 * @param m
	 * @param flavors
	 */
	private static void print(int m, int[] flavors) {

		// Arrays.sort(flavors);
		out: for (int i = 0; i < flavors.length; i++) {
			int f1 = flavors[i];
			int f2 = m - f1;

			for (int j = 0; j < flavors.length; j++) {
				if (j != i && flavors[j] == f2) {
					int iPrintable = i + 1;
					int jPrintable = j + 1;
					System.out.println(iPrintable + " " + jPrintable);
					break out;
				}
			}
		}

	}

}