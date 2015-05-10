package alessio.hackerrank.algorithms.sorting;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/quicksort1 
 */
public class QuickSort1 {

	static void partition(int[] ar) {
		ArrayList<Integer> leftOfP = new ArrayList<Integer>();
		ArrayList<Integer> rightOfP = new ArrayList<Integer>();
		ArrayList<Integer> pList = new ArrayList<Integer>();

		int P = ar[0];
		for (int i = 0; i < ar.length; i++) {
			if (ar[i] < P)
				leftOfP.add(ar[i]);
			else if (ar[i] > P)
				rightOfP.add(ar[i]);
			else
				pList.add(ar[i]);
		}

		leftOfP.addAll(pList);
		leftOfP.addAll(rightOfP);
		int[] ar2 = convert(leftOfP);
		printArray(ar2);

	}

	static int[] convert(ArrayList<Integer> l) {
		int[] result = new int[l.size()];
		for (int i = 0; i < l.size(); i++) {
			result[i] = l.get(i).intValue();
		}
		return result;
	}

	static void printArray(int[] ar) {
		for (int n : ar) {
			System.out.print(n + " ");
		}
		System.out.println("");
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] ar = new int[n];
		for (int i = 0; i < n; i++) {
			ar[i] = in.nextInt();
		}
		partition(ar);
		in.close();
	}

}