package br.com.mesquitagomes.codility.lessons.timecomplexity;

public class TimeComplexity {

	/**
	 * Constant time — O(1).
	 * 
	 * @param n
	 * @return
	 */
	public int constant(int n) {

		int result = n * n;
		return result;
	}

	/**
	 * Logarithmic time — O(log n).
	 * 
	 * @param n
	 * @return
	 */
	public int logarithmic(int n) {

		int result = 0;
		while (n > 1) {
			n /= 2;
			result += 1;
		}
		return result;
	}

	/**
	 * Linear time — O(n).
	 * 
	 * @param n
	 * @return
	 */
	public int linear(int n, int[] A) {

		for (int i = 0; i < n; i++) {
			if (A[i] == 0) return 0;
		}
		return 1;
	}

	/**
	 * Quadratic time — O(n2).
	 * 
	 * @param n
	 * @return
	 */
	public int quadratic(int n) {

		int result = 0;
		for (int i = 0; i < n; i++) {
			for (int j = i; j < n; j++) {
				result += 1;
			}
		}
		return result;
	}

	/**
	 * Linear time — O(n + m).
	 * 
	 * @param n
	 * @return
	 */
	public int linear2(int n, int m) {

		int result = 0;
		for (int i = 0; i < n; i++) {
			result += i;
		}
		for (int j = 0; j < n; j++) {
			result += j;
		}
		return result;
	}

	/**
	 * Slow solution — time complexity O(n2).
	 * 
	 * @param n
	 * @return
	 */
	public int slow_solution(int n) {

		int result = 0;
		for (int i = 0; i < n; i++) {
			for (int j = i; j < n; j++) {
				result += 1;
			}
		}
		return result;
	}

	/**
	 * Fast solution — time complexity O(n).
	 * 
	 * @param n
	 * @return
	 */
	public int fast_solution(int n) {

		int result = 0;
		for (int i = 0; i < n; i++) {
			result += i + 1;
		}
		return result;
	}

	/**
	 * Fast solution — time complexity O(n).
	 * 
	 * @param n
	 * @return
	 */
	public int model_solution(int n) {

		int result = n * (n + 1) / 2;
		return result;
	}

	/**
	 * Problem: You are given an integer n. Count the total of 1+2+ ... + n.
	 * 
	 * Solution: The task can be solved in several ways. Some person, who knows nothing about time complexity, may implement an algorithm in
	 * which the result is incremented by 1:
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		TimeComplexity tc = new TimeComplexity();

		for (int i = 0; i < 6; i++) {
			System.out.print(" for n= " + i);
			System.out.print(" slow= " + tc.slow_solution(i));
			System.out.print(" fast= " + tc.fast_solution(i));
			System.out.println(" model= " + tc.model_solution(i));
		}

	}

}
