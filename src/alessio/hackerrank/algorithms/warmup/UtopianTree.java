package alessio.hackerrank.algorithms.warmup;

import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/utopian-tree
 */
public class UtopianTree {
	   public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int n =  sc.nextInt();
	        for (int t=0;t<n;t++) {
	            int cycles = sc.nextInt();
	            System.out.println(calc(cycles));
	        }
	        sc.close();
	    }
	    
	    private static int calc(int x) {
	        if (x == 0)
	            return 1;
	        else {
	            int calcX_1 = calc(x-1);
	            if (x % 2 == 0)
	                return 1 + calcX_1;
	            else
	                return 2*calcX_1;
	        }
	    }
	    
}
