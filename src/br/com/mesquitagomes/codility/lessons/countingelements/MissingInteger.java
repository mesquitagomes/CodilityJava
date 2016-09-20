package br.com.mesquitagomes.codility.lessons.countingelements;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Write a function:
 * 
 * class Solution { public int solution(int[] A); }
 * 
 * that, given a non-empty zero-indexed array A of N integers, returns the minimal positive integer (greater than 0) that does not occur in
 * A.
 * 
 * For example, given:
 * 
 * A[0] = 1 A[1] = 3 A[2] = 6 A[3] = 4 A[4] = 1 A[5] = 2
 * 
 * the function should return 5.
 * 
 * Assume that:
 * 
 * <pre>
 * * N is an integer within the range [1..100,000];
 * * each element of array A is an integer within the range [-2,147,483,648..2,147,483,647].
 * </pre>
 * 
 * Complexity:
 * 
 * <pre>
 * * expected worst-case time complexity is O(N);
 * * expected worst-case space complexity is O(N), beyond input storage (not counting the storage required for input arguments).
 * </pre>
 * 
 * Elements of input arrays can be modified.
 * 
 * @author mesquitagomes
 *
 */
public class MissingInteger {

	/**
	 * https://codility.com/demo/results/trainingJ9MZ6W-UC6/
	 * 
	 * @param A
	 * @return
	 */
	public int mySolution(int[] A) {

		int max = Integer.MIN_VALUE;
		Set<Integer> positives = new HashSet<Integer>();

		for (int a : A) {
			if (a > 0) {
				if (a > max) max = a;
				if (!positives.contains(a)) positives.add(a);
			}
		}

		for (int i = 1; i <= max; i++)
			if (!positives.contains(i)) return i;

		return max < 1 ? 1 : max + 1;
	}

	/**
	 * https://codility.com/demo/results/trainingUDBQEM-NKE/
	 * 
	 * @param A
	 * @return
	 */
	public int bestSolution(int[] A) {

		Arrays.sort(A);
		int min = 1;

		for (int i = 0; i < A.length; i++)
			if (A[i] > 0 && A[i] == min) min++;

		return min;
	}

	public static void main(String[] args) {

		MissingInteger mi = new MissingInteger();

		List<int[]> arrays = new ArrayList<int[]>();
		arrays.add(new int[] { 1, 3, 6, 4, 1, 2 });
		arrays.add(new int[] { 1, 3, 4 });
		arrays.add(new int[] { 2, 2 });
		arrays.add(new int[] { 3 });
		arrays.add(new int[] { 1 });
		arrays.add(new int[] { -1, -3, -6, -4, 1, 3 });

		for (int i = 0; i < arrays.size(); i++) {
			int[] A = arrays.get(i);

			System.out.println("For A = " + Arrays.toString(A));
			System.out.print("    mySolution = " + mi.mySolution(A));
			System.out.println(" bestSolution = " + mi.bestSolution(A));
		}
	}

}
