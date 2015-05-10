package alessio.hackerrank.algorithms.warmup;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/halloween-party
 */
public class HalloweenParty {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int i = 0; i < T; i++) {
			int K = sc.nextInt();
			System.out.println(calc(K));
		}
		sc.close();
	}

	private static BigInteger calc(int K) {
		int half = K / 2;
		BigInteger g = new BigInteger("" + half).multiply(new BigInteger(
				(K - half) + ""));
		return g;
	}

}
