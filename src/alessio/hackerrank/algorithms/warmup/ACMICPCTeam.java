package alessio.hackerrank.algorithms.warmup;

import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/acm-icpc-team
 */
public class ACMICPCTeam {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		String[] bMatrix = new String[N];
		for (int i = 0; i < N; i++) {
			bMatrix[i] = sc.next();
		}

		int maxTopics = 0;
		int nTeams = 0;

		for (int i = 0; i < N - 1; i++) {
			for (int j = i + 1; j < N; j++) {
				int bwise = bitwiseComp(bMatrix[i], bMatrix[j]);
				if (bwise == maxTopics)
					nTeams++;
				else if (bwise > maxTopics) {
					maxTopics = bwise;
					nTeams = 1;

				}

			}
		}
		sc.close();

		System.out.println(maxTopics);
		System.out.println(nTeams);
	}

	private static int bitwiseComp(String str1, String str2) {
		int acc = 0;
		for (int i = 0; i < str1.length(); i++) {
			if (str1.charAt(i) == '1' || str2.charAt(i) == '1')
				acc++;
		}

		return acc;
	}
}
