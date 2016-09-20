package br.com.mesquitagomes.codility.lessons.countingelements;

import java.util.Arrays;

/**
 * A non-empty zero-indexed array A consisting of N integers is given.
 * 
 * A permutation is a sequence containing each element from 1 to N once, and only once.
 * 
 * For example, array A such that:
 * 
 * A[0] = 4 A[1] = 1 A[2] = 3 A[3] = 2
 * 
 * is a permutation, but array A such that:
 * 
 * A[0] = 4 A[1] = 1 A[2] = 3
 * 
 * is not a permutation, because value 2 is missing.
 * 
 * The goal is to check whether array A is a permutation.
 * 
 * Write a function:
 * 
 * class Solution { public int solution(int[] A); }
 * 
 * that, given a zero-indexed array A, returns 1 if array A is a permutation and 0 if it is not.
 * 
 * For example, given array A such that:
 * 
 * A[0] = 4 A[1] = 1 A[2] = 3 A[3] = 2
 * 
 * the function should return 1.
 * 
 * Given array A such that:
 * 
 * A[0] = 4 A[1] = 1 A[2] = 3
 * 
 * the function should return 0.
 * 
 * Assume that:
 * 
 * <pre>
 * * N is an integer within the range [1..100,000];
 * * each element of array A is an integer within the range [1..1,000,000,000].
 * </pre>
 * 
 * Complexity:
 * 
 * <pre>
 * * expected worst-case time complexity is O(N); expected worst-case space complexity is O(N), beyond input storage (not counting the storage
 * * required for input arguments). Elements of input arrays can be modified.
 * </pre>
 * 
 * @author mesquitagomes
 *
 */
public class PermCheck {

	public int solution(int[] A) {

		int n = A.length;
		int[] count = new int[n + 1];

		for (int i = 0; i < n; i++) {
			int a = A[i];
			if (1 <= a && a <= n) count[a] += 1;
			else return 0;
		}

		for (int i = 1; i < count.length; i++) {
			if (count[i] == 0) return 0;
		}

		return 1;
	}

	public static void main(String[] args) {

		PermCheck pc = new PermCheck();
		int[][] arrays = new int[3][1];
		arrays[0] = new int[] { 4, 1, 3, 2 };
		arrays[1] = new int[] { 4, 1, 3 };
		arrays[2] = new int[] { 1, 1 };

		for (int i = 0; i < arrays.length; i++) {
			int[] A = arrays[i];

			System.out.println("For A = " + Arrays.toString(A) + " Is perm? " + pc.solution(A));
		}
	}
}
