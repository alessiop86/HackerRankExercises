package alessio.hackerrank.algorithms.warmup;

import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/find-digits
 */

public class FindDigits {

	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT.
		 * Your class should be named Solution.
		 */
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int i = 0; i < T; i++) {
			long N = sc.nextInt();
			System.out.println(calc(N));
		}
		sc.close();
	}

	private static int calc(long N) {
		String str = "" + N;
		char[] digits = str.toCharArray();
		int count = 0;
		for (int i = 0; i < digits.length; i++) {
			try {
				long div = Long.parseLong("" + digits[i]);
				if (N % div == 0)
					count++;
			} catch (Exception e) {
				System.err.println("ERRORE CON " + digits[i]);
			}
		}
		return count;
	}

}