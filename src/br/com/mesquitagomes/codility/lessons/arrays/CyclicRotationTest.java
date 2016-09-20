package br.com.mesquitagomes.codility.lessons.arrays;

import java.util.Arrays;

import junit.framework.TestCase;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
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
 * @author mesquitagomes
 *
 */
public class CyclicRotationTest extends TestCase {

	private CyclicRotation cr;
	private int[][] tests;
	private int[] testIndexes;

	@Before
	public void setUp() throws Exception {

		cr = new CyclicRotation();

		tests = new int[26][1];

		// K indexes
		testIndexes = new int[] { 0, 3, 6, 14, 19, 23 };

		tests[0] = new int[] { 3 }; // K
		tests[1] = new int[] { 3, 8, 9, 7, 6 }; // int[] input // example
		tests[2] = new int[] { 9, 7, 6, 3, 8 }; // int[] expected

		tests[3] = new int[] { 1 }; // K
		tests[4] = new int[] {}; // int[] input // empty
		tests[5] = new int[] {}; // int[] expected

		tests[6] = new int[] { 0, 1, 2, 3, 4, 5 }; // 0 <= K <= 5
		tests[7] = new int[] { 1 }; // int[] input // single
		tests[8] = new int[] { 1 }; // int[] expected
		tests[9] = new int[] { 1 }; // int[] expected
		tests[10] = new int[] { 1 }; // int[] expected
		tests[11] = new int[] { 1 }; // int[] expected
		tests[12] = new int[] { 1 }; // int[] expected
		tests[13] = new int[] { 1 }; // int[] expected

		tests[14] = new int[] { 0, 1, 2 }; // K <= N
		tests[15] = new int[] { 1, 2 }; // int[] input // double
		tests[16] = new int[] { 1, 2 }; // int[] expected
		tests[17] = new int[] { 2, 1 }; // int[] expected
		tests[18] = new int[] { 1, 2 }; // int[] expected

		tests[19] = new int[] { 5, 6 }; // K >= N
		tests[20] = new int[] { 3, 8, 9, 7, 6 }; // int[] input
		tests[21] = new int[] { 3, 8, 9, 7, 6 }; // int[] expected
		tests[22] = new int[] { 6, 3, 8, 9, 7 }; // int[] expected

		tests[23] = new int[] { 15 }; // K = 15
		tests[24] = new int[] { 3, 8, 9, 7, 6, 5 }; // int[] input
		tests[25] = new int[] { 7, 6, 5, 3, 8, 9 }; // int[] expected

	}

	@After
	public void tearDown() throws Exception {

		cr = null;
		tests = null;
		testIndexes = null;
	}

	@Test
	public void testSolution() {

		for (int i : testIndexes) {

			int[] K = tests[i];
			int[] A = tests[i + 1];

			for (int j = 0; j < K.length; j++) {

				int k = K[j];
				int[] expected = tests[i + 2 + j];

				int[] actual = cr.solution(A, k);

				if (!Arrays.equals(expected, actual)) {
					fail("For K=" + k + " expected " + Arrays.toString(expected) + " actual " + Arrays.toString(actual));
				}
			}
		}
	}

}
