package alessio.hackerrank.algorithms.combinatorics;

import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/handshake
 */
public class HandShake {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i=0;i<T;i++) {
            int N = sc.nextInt();
            System.out.println(shakes(N));
        }
    }
    
    private static int shakes(int n) {
        if (n <= 1)
            return 0;
        else {
            int shakes = 0;
            for (int m1 = 0; m1<n-1;m1++) {
                for (int m2 = m1+1;m2 < n;m2++) {
                    shakes++;
                }
            }
            return shakes;
        }
    }
}