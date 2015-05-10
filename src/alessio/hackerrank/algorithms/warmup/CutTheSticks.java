package alessio.hackerrank.algorithms.warmup;

import java.util.Arrays;
import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/cut-the-sticks
 */

public class CutTheSticks {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] sticks = new int[N];
		for (int i = 0; i < sticks.length; i++) {
			sticks[i] = sc.nextInt();
		}

		Arrays.sort(sticks, 0, N);

		do_(sticks);
		sc.close();
	}

	private static void do_(int[] sticks) {
		System.out.println(sticks.length);

		int min = sticks[0];
		int nOfMinElements = 1;
		for (int i = 1; i < sticks.length; i++)
			if (sticks[i] == min)
				nOfMinElements++;
			else
				break;

		int[] newSticks = new int[sticks.length - nOfMinElements];
		for (int j = 0; j < newSticks.length; j++) {
			newSticks[j] = sticks[j + nOfMinElements] - min;
		}
		if (newSticks.length > 0)
			do_(newSticks);
	}
}
