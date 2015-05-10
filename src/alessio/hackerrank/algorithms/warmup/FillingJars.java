package alessio.hackerrank.algorithms.warmup;

import java.math.BigInteger;
import java.util.Scanner;

/**
	https://www.hackerrank.com/challenges/filling-jars
 */
public class FillingJars {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		// long candies = 0;
		BigInteger candies = new BigInteger("0");
		for (int i = 0; i < M; i++) {
			long a = sc.nextLong();
			long b = sc.nextLong();
			long k = sc.nextLong();

			// candies+= k * (b - a + 1);
			BigInteger sng = new BigInteger(k * (b - a + 1) + "");
			// System.out.println("SNG=" + sng);
			candies = candies.add(sng);
		}
		// System.out.println("CANDIES=" + candies);
		BigInteger media = candies.divide(new BigInteger("" + N));
		System.out.println(media);

		sc.close();
	}
}