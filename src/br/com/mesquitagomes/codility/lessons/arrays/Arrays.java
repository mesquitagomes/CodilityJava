package br.com.mesquitagomes.codility.lessons.arrays;

public class Arrays {

	/**
	 * Given array A consisting of N integers, return the reversed array.
	 * 
	 * 
	 * @param array
	 */
	public static void reverseArray(int[] array) {

		int n = array.length;
		int k;
		int aux;

		for (int i = 0; i < (array.length / 2); i++) {
			k = n - i - 1;
			aux = array[i];
			array[i] = array[k];
			array[k] = aux;
		}

	}

	public static void printArray(int[] array) {

		int aux;

		for (int i = 0; i < array.length; i++) {
			aux = array[i];
			if (i == 0) System.out.print(aux);
			else System.out.print(", " + aux);
		}

	}

	public static void main(String[] args) {

		System.out.println("\nReverse Array\n");

		int[] array = { 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 };

		System.out.println("Befor reverse: ");
		printArray(array);

		reverseArray(array);

		System.out.println("\nAfter reverse: ");
		printArray(array);

	}
}
