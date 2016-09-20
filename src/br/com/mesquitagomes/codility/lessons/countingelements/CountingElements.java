package br.com.mesquitagomes.codility.lessons.countingelements;

import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * Problem: You are given an integer m (1 <= m <= 1 000 000) and two non-empty, zero-indexed arrays A and B of n integers, a0, a1, . . . ,
 * an-1 and b0, b1, . . . , bn-1 respectively (0 <= ai, bi <= m). The goal is to check whether there is a swap operation which can be
 * performed on these arrays in such a way that the sum of elements in array A equals the sum of elements in array B after the swap. By swap
 * operation we mean picking one element from array A and one element from array B and exchanging them.
 * 
 * Slow Solution O(n^2): The simplest method is to swap every pair of elements and calculate the totals. Using that approach gives us O(n^3)
 * time complexity. A better approach is to calculate the sums of elements at the beginning, and check only how the totals change during the
 * swap operation.
 * 
 * Fast Solution O(n + m): The best approach is to count the elements of array A and calculate the difference d between the sums of the
 * elements of array A and B. For every element of array B, we assume that we will swap it with some element from array A. The difference d
 * tells us the value from array A that we are interested in swapping, because only one value will cause the two totals to be equal. The
 * occurrence of this value can be found in constant time from the array used for counting.
 * 
 * @author mesquitagomes
 *
 */
public class CountingElements {

	/**
	 * Counting elements — O(n + m).
	 * 
	 * @param A
	 * @param m
	 * @return
	 */
	public static int[] counting(int[] A, int m) {

		int n = A.length;
		int[] count = new int[m + 1];

		for (int i = 0; i < n; i++) {
			count[A[i]] += 1;
		}
		return count;
	}

	/**
	 * Swap the elements — O(n^2).
	 * 
	 * @param A
	 * @param B
	 * @param m
	 * @return
	 */
	public static boolean slow_solution(int[] A, int[] B, int m) {

		int n = A.length;
		int sum_a = IntStream.of(A).sum();
		int sum_b = IntStream.of(B).sum();

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				int change = B[j] - A[i];
				sum_a += change;
				sum_b -= change;
				if (sum_a == sum_b) return true;
				sum_a -= change;
				sum_b += change;
			}
		}

		return false;
	}

	/**
	 * Swap the elements — O(n + m)
	 * 
	 * @param A
	 * @param B
	 * @param m
	 * @return
	 */
	public static boolean fast_solution(int[] A, int[] B, int m) {

		int n = A.length;
		int sum_a = IntStream.of(A).sum();
		int sum_b = IntStream.of(B).sum();
		int d = sum_b - sum_a;

		if (d % 2 == 1) return false;

		d /= 2;
		int[] count = counting(A, m);

		for (int i = 0; i < n; i++) {
			int x = B[i] - d;
			if (0 <= x && x <= m && count[x] > 0) return true;
		}
		return false;
	}

	public static void main(String[] args) {

		int[] A = { 0, 0, 4, 2, 4, 5 };
		int[] B = { 0, 2, 4, 2, 4, 5 };
		int m = 5;

		System.out.println("For A = " + Arrays.toString(A) + " and m = " + m);
		System.out.println("    R = " + Arrays.toString(counting(A, m)));

		System.out.println("\nFor A = " + Arrays.toString(A) + ", B = " + Arrays.toString(B) + " and m = " + m);
		System.out.println("    R = " + fast_solution(A, B, m));

	}
}
