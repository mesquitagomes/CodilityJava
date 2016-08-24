package br.com.mesquitagomes.codility.lessons.iterations;

import junit.framework.TestCase;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class BinaryGapJUTest extends TestCase {

	private BinaryGap bg;
	private int[] nArray = null;
	private int[] nLengthArray = null;

	@Before
	public void setUp() throws Exception {

		bg = new BinaryGap();

		nArray = new int[8];
		nArray[0] = 9;
		nArray[1] = 529;
		nArray[2] = 20;
		nArray[3] = 15;
		nArray[4] = 1041;
		nArray[5] = 561892;
		nArray[6] = 74901729;
		nArray[7] = 1376796946;

		nLengthArray = new int[8];
		nLengthArray[0] = 2;
		nLengthArray[1] = 4;
		nLengthArray[2] = 1;
		nLengthArray[3] = 0;
		nLengthArray[4] = 5;
		nLengthArray[5] = 3;
		nLengthArray[6] = 4;
		nLengthArray[7] = 5;

	}

	@After
	public void tearDown() throws Exception {

		bg = null;
		nArray = null;
		nLengthArray = null;

	}

	@Test
	public void testSolution() {

		for (int i = 0; i < nArray.length; i++) {
			int N = nArray[i];
			int nLength = nLengthArray[i];
			int sLength = bg.solution(N);
			assertEquals("For N = " + N + " binary = " + Integer.toBinaryString(N), nLength, sLength);
		}

	}

	@Test
	public void testToBinaryString() {

		for (int i = 0; i < nArray.length; i++) {
			int N = nArray[i];
			String myBinary = BinaryGap.toBinaryString(N);
			String javaBinary = Integer.toBinaryString(N);
			assertEquals("For N = " + N, javaBinary, myBinary);
		}

	}

}
