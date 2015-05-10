package alessio.hackerrank.algorithms.warmup;

import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/service-lane
 */

public class ServiceLane {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int tc = sc.nextInt();
		int[] lane = new int[N];
		for (int i = 0; i < N; i++) {
			lane[i] = sc.nextInt();
		}

		for (int i = 0; i < tc; i++) {
			int enter = sc.nextInt();
			int exit = sc.nextInt();
			int min = 3;
			for (int j = enter; j <= exit; j++) {
				if (lane[j] < min)
					min = lane[j];
			}
			System.out.println(min);
		}
		sc.close();
	}

}
