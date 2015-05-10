package alessio.hackerrank.algorithms.combinatorics;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/connecting-towns
*/


public class ConnectingTowns {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for (int ti = 0; ti < t; ti++) {
			int n = sc.nextInt();

			//int and long are not enough to 
			//pass all the unit tests provided
			//from the hacker rank platform
			BigInteger roads = new BigInteger("1");
			for (int j = 0; j < n - 1; j++) {
				roads = roads.multiply(new BigInteger("" + sc.nextInt()));
			}
			
			//output format required in modulo 1234567 
			System.out.println(roads.mod(new BigInteger("1234567")));
		}
		sc.close();
	}
}