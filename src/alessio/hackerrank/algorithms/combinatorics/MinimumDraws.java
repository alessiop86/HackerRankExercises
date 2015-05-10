package alessio.hackerrank.algorithms.combinatorics;

/**
 * https://www.hackerrank.com/challenges/minimum-draws
 */

import java.util.Scanner;

public class MinimumDraws {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i=0;i<T;i++) {
            int pairs = sc.nextInt();
            System.out.println(pairs+1);
        }
        sc.close();
        
    }
}
