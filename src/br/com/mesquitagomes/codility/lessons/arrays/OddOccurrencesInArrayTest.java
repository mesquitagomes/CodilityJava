package br.com.mesquitagomes.codility.lessons.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import junit.framework.TestCase;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * @author mesquitagomes
 *
 */
public class OddOccurrencesInArrayTest extends TestCase {

	private OddOccurrencesInArray oddOccInArray;
	private List<int[]> AList;
	private List<Integer> solutionList;

	@Before
	public void setUp() throws Exception {

		oddOccInArray = new OddOccurrencesInArray();
		AList = new ArrayList<int[]>();
		solutionList = new ArrayList<Integer>();

		AList.add(new int[] { 9, 3, 9, 3, 9, 7, 9 });
		AList.add(new int[] { 1, 2, 1, 2, 3 });
		AList.add(new int[] { 1, 2, 3, 1, 2, 3, 4 });
		AList.add(new int[] { 1, 2, 8, 1, 2 });
		AList.add(new int[] { 10, 1, 1 });

		solutionList.add(7);
		solutionList.add(3);
		solutionList.add(4);
		solutionList.add(8);
		solutionList.add(10);

	}

	@After
	public void tearDown() throws Exception {

	}

	@Test
	public void testMySolution() {

		for (int i = 0; i < AList.size(); i++) {

			int[] A = AList.get(i);
			String msg = "For " + Arrays.toString(A);
			int expected = solutionList.get(i);
			int actual = oddOccInArray.mySolution(A);
			assertEquals(msg, expected, actual);
		}
	}

	@Test
	public void testBestSolution() {

		for (int i = 0; i < AList.size(); i++) {

			int[] A = AList.get(i);
			String msg = "For " + Arrays.toString(A);
			int expected = solutionList.get(i);
			int actual = oddOccInArray.bestSolution(A);
			assertEquals(msg, expected, actual);
		}
	}

}
