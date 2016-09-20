package br.com.mesquitagomes.codility;

public class Test {

	public static void main(String[] args) {

		int[][] tests = new int[3][1];
		int[] K = { 3 };
		tests[0] = K;
		int[] A = { 3, 8, 9, 7, 6 };
		tests[1] = A;
		int[] AExp = { 9, 7, 6, 3, 8 };
		tests[2] = AExp;

		System.out.println(A);

		for (int i = 0; i < tests.length; i++) {
			int[] a = tests[i];
			for (int j = 0; j < a.length; j++) {
				int b = a[j];
				System.out.println("i=" + i + " j=" + j + " b=" + b);
			}
		}

	}

}
