package br.com.mesquitagomes.codility.lessons.iterations;

/**
 * A binary gap within a positive integer N is any maximal sequence of consecutive zeros that is surrounded by ones at both ends in the
 * binary representation of N.
 * 
 * For example, number 9 has binary representation 1001 and contains a binary gap of length 2. The number 529 has binary representation
 * 1000010001 and contains two binary gaps: one of length 4 and one of length 3. The number 20 has binary representation 10100 and contains
 * one binary gap of length 1. The number 15 has binary representation 1111 and has no binary gaps.
 * 
 * Write a function:
 * 
 * class Solution { public int solution(int N); }
 * 
 * that, given a positive integer N, returns the length of its longest binary gap. The function should return 0 if N doesn't contain a
 * binary gap.
 * 
 * For example, given N = 1041 the function should return 5, because N has binary representation 10000010001 and so its longest binary gap
 * is of length 5.
 * 
 * Assume that:
 * 
 * N is an integer within the range [1..2,147,483,647]. Complexity:
 * 
 * expected worst-case time complexity is O(log(N)); expected worst-case space complexity is O(1). Copyright 2009–2016 by Codility Limited.
 * All Rights Reserved. Unauthorized copying, publication or disclosure prohibited.
 * 
 * @author a542445
 *
 */
public class BinaryGap {

	public int solution(int N) {

		String str = toBinaryString(N);
		int counter = 0;
		int aux;
		int biggestGap = 0;

		for (int i = 0; i < str.length(); i++) {
			aux = Integer.valueOf(String.valueOf(str.charAt(i)));
			if (aux == 1) {
				if (biggestGap < counter) biggestGap = counter;
				counter = 0;
			} else if (aux == 0) counter += 1;
		}

		return biggestGap;
	}

	public static String toBinaryString(int N) {

		String binary = "";

		while (N > 1) {
			binary = (N % 2) + binary;
			N = N >> 1;
			if (N <= 1) binary = N + binary;
		}

		return binary;
	}

	public static void main(String[] args) {

		int[] nArray = { 9, 529, 20, 15, 1041, 561892, 74901729, 1376796946 };
		int[] nLengthArray = { 2, 4, 1, 0, 5, 3, 4, 5 };
		BinaryGap bg = new BinaryGap();

		for (int i = 0; i < nArray.length; i++) {
			int N = nArray[i];
			int nLength = nLengthArray[i];
			System.out.println("\nFor N = " + N + " binary = " + Integer.toBinaryString(N) + " expect length = " + nLength + ": ");
			System.out.println(bg.solution(N) == nLength ? "OK" : "ERROR");
		}

	}

}
