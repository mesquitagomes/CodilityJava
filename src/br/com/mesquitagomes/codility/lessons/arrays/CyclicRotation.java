package br.com.mesquitagomes.codility.lessons.arrays;

/**
 * A zero-indexed array A consisting of N integers is given. Rotation of the array means that each element is shifted right by one index,
 * and the last element of the array is also moved to the first place.
 * 
 * For example, the rotation of array A = [3, 8, 9, 7, 6] is [6, 3, 8, 9, 7]. The goal is to rotate array A K times; that is, each element
 * of A will be shifted to the right by K indexes.
 * 
 * Write a function:
 * 
 * class Solution { public int[] solution(int[] A, int K); }
 * 
 * that, given a zero-indexed array A consisting of N integers and an integer K, returns the array A rotated K times.
 * 
 * For example, given array A = [3, 8, 9, 7, 6] and K = 3, the function should return [9, 7, 6, 3, 8].
 * 
 * Assume that:
 * 
 * - N and K are integers within the range [0 ... 100];
 * 
 * - each element of array A is an integer within the range [-1,000 ... 1,000]. In your
 * 
 * solution, focus on correctness. The performance of your solution will not be the focus of the assessment.
 * 
 * 
 * 
 * example example test OK
 * 
 * extreme_empty empty array OK
 * 
 * single one element, 0 <= K <= 5 OK
 * 
 * double two elements, K <= N OK
 * 
 * small1 small functional tests, K < N OK
 * 
 * small2 small functional tests, K >= N OK
 * 
 * small_random_all_rotations small random sequence, all rotations, N = 15 OK
 * 
 * medium_random medium random sequence, N = 100 OK
 * 
 * maximal maximal N and K
 * 
 * @author a542445
 *
 */
public class CyclicRotation {

	public int[] solution(int[] A, int K) {

		int aLength = A.length;
		int[] B = new int[aLength];
		int x = 0;

		for (int i = 0; i < aLength; i++) {
			x = K + i;
			if (x >= aLength) x -= (Math.round(x / aLength) * aLength);
			B[x] = A[i];
		}

		return B;
	}

	public static void main(String[] args) {

		int[] A = { 3, 8, 9, 7, 6 };
		int K = 3;
		// int[] A = { 3, 8, 9, 7, 6, 5 };
		// int K = 12;

		for (int b : new CyclicRotation().solution(A, K)) {
			System.out.print(b + " ");
		}

	}

}
