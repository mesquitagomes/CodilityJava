package br.com.mesquitagomes.codility.lessons.timecomplexity;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * A zero-indexed array A consisting of N different integers is given. The array contains integers in the range [1..(N + 1)], which means
 * that exactly one element is missing.
 * 
 * Your goal is to find that missing element.
 * 
 * Write a function:
 * 
 * class Solution { public int solution(int[] A); }
 * 
 * that, given a zero-indexed array A, returns the value of the missing element.
 * 
 * For example, given array A such that:
 * 
 * <pre>
 *   A[0] = 2
 *   A[1] = 3
 *   A[2] = 1
 *   A[3] = 5
 * </pre>
 * 
 * the function should return 4, as it is the missing element.
 * 
 * Assume that:
 * 
 * <pre>
 * * N is an integer within the range [0..100,000];
 * * the elements of A are all distinct;
 * * each element of array A is an integer within the range [1..(N + 1)].
 * </pre>
 * 
 * Complexity:
 * 
 * <pre>
 * * expected worst-case time complexity is O(N);
 * * expected worst-case space complexity is O(1), beyond input storage (not counting the storage required for input arguments).
 * * Elements of input arrays can be modified.
 * </pre>
 * 
 * @author mesquitagomes
 *
 */
public class PermMissingElem {

	public int solution(int[] A) {

		int N = A.length;
		int sumA = 0;
		int sumI = N + 1;

		for (int i = 0; i < N; i++) {
			sumA += A[i];
			sumI += i + 1;
		}

		return sumI - sumA;
	}

	public int bestSolution(int[] A) {

		long len = A.length;
		long sum = 0;
		for (int i = 0; i < len; i++) {
			sum += A[i];
		}
		return (int) ((len + 1) * (len + 2) / 2 - sum);
	}

	public static void main(String[] args) {

		PermMissingElem pme = new PermMissingElem();
		List<int[]> AList = new ArrayList<int[]>();

		AList.add(new int[] {});
		AList.add(new int[] { 1 });
		AList.add(new int[] { 1, 2 });
		AList.add(new int[] { 3, 2 });
		AList.add(new int[] { 2, 3, 1, 5 });

		for (int[] A : AList) {

			System.out.println("For A = " + Arrays.toString(A));
			System.out.print(" my_solution = " + pme.solution(A));
			System.out.println(" best_solution = " + pme.bestSolution(A));
		}

	}

}
