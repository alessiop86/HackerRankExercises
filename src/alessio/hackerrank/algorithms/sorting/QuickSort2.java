package alessio.hackerrank.algorithms.sorting;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/quicksort2
*/

public class QuickSort2 {

	static ArrayList<Integer> partition(ArrayList<Integer> begin) {

		if (begin.size() == 0)
			return new ArrayList<Integer>();

		if (begin.size() == 1) {

			ArrayList<Integer> output = new ArrayList<Integer>();
			output.add(begin.get(0));
			return output;
		}

		Integer pivot = begin.get(0);
		ArrayList<Integer> lt_pivot = new ArrayList<Integer>();
		ArrayList<Integer> gt_pivot = new ArrayList<Integer>();
		for (int j = 1; j < begin.size(); j++) {
			int i = begin.get(j);
			if (i < pivot)
				lt_pivot.add(i);
			else
				gt_pivot.add(i);
		}

		ArrayList<Integer> result = partition(lt_pivot);
		result.add(pivot);
		result.addAll(partition(gt_pivot));
		printArray(result);

		return result;
	}

	static void quickSort(int[] ar) {
		ArrayList<Integer> nl = new ArrayList<Integer>();
		for (int i : ar)
			nl.add(new Integer(i));

		partition(nl);
	}

	static void printArray(ArrayList<Integer> ar) {
		for (Integer n : ar) {
			System.out.print(n + " ");
		}
		System.out.println("");
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
		quickSort(ar);
		in.close();
	}

}