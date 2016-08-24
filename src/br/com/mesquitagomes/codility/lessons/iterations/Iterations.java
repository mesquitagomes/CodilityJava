package br.com.mesquitagomes.codility.lessons.iterations;

import java.util.LinkedHashMap;
import java.util.Map;

public class Iterations {

	/**
	 * Given some positive integer n. Let’s compute the factorial of n and assign it to the variable factorial. The factorial of n is n! = 1
	 * · 2 · ... · n. We can obtain it by starting with 1 and multiplying it by all the integers from 1 to n.
	 * 
	 * @param n
	 */
	public static int factorial(int n) {

		int factorial = 1;
		for (int i = 1; i < n + 1; i++) {
			factorial *= i;
		}
		return factorial;
	}

	/**
	 * Print a triangle made of asterisks (‘*’) separated by spaces. The triangle should consist of n rows, where n is a given positive
	 * integer, and consecutive rows should contain 1, 2, ... , n asterisks. For example, for n = 4 the triangle should appear as follows:
	 * 
	 * <pre>
	 * *
	 * * *
	 * * * *
	 * * * * *
	 * </pre>
	 * 
	 * @param n
	 */
	public static void asterisksTriangle(int n) {

		for (int i = 0; i < (n + 1); i++) {
			System.out.println("");
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
		}

	}

	/**
	 * Print a triangle made of asterisks (‘*’) separated by spaces and consisting of n rows again, but this time upside down, and make it
	 * symmetrical. Consecutive rows should contain 2n - 1, 2n - 3, ... , 3, 1 asterisks and should be indented by 0, 2, 4, . . . , 2(n - 1)
	 * spaces. For example, for n = 4 the triangle should appear as follows:
	 * 
	 * <pre>
	 * * * * *
	 *  * * *
	 *   * *
	 *    *
	 * </pre>
	 * 
	 * @param n
	 */
	public static void upsideDownAsterisksTriangle(int n) {

		for (int i = n; i > 0; i--) {
			System.out.println("");
			for (int j = 0; j < (n - i); j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < (2 * i - 1); j++) {
				System.out.print("*");
			}
		}

	}

	/**
	 * Given a positive integer n, count the number of digits in its decimal representation.
	 * 
	 * @param n
	 * @return
	 */
	public static int countNumberOfDigits(int n) {

		int result = 0;

		while (n > 0) {
			n = n / 10;
			result += 1;
		}

		return result;

	}

	/**
	 * The Fibonacci numbers form a sequence of integers defined recursively in the following way. The first two numbers in the Fibonacci
	 * sequence are 0 and 1, and each subsequent number is the sum of the previous two. The first few elements in this sequence are: 0, 1,
	 * 1, 2, 3, 5, 8, 13. Let’s write a program that prints all the Fibonacci numbers, not exceeding a given integer n.
	 * 
	 * @param n
	 */
	public static void fibonacciWhile(int n) {

		int a = 0;
		int b = 1;
		int c = 0;

		while (a <= n) {
			if (a == 0) System.out.print(a);
			else System.out.print(", " + a);
			c = a + b;
			a = b;
			b = c;
		}

	}

	/**
	 * Looping over collections of values
	 * 
	 * @param array
	 */
	public static void overArray(String[] array) {

		for (String str : array) {
			System.out.println(str);
		}

	}

	/**
	 * Looping over collections of values
	 * 
	 * @param map
	 */
	public static void overArray(Map<String, String> map) {

		for (String key : map.keySet()) {
			System.out.println(key + " stands for " + map.get(key));
		}

	}

	public static void main(String[] args) {

		int n = 4;

		System.out.println("Factorial(" + n + ") = " + factorial(n));

		System.out.print("\nAsterisks Triangle for n = " + n);

		asterisksTriangle(n);

		System.out.println("\n\nUpside Down Asterisks Triangle for n = " + n);

		upsideDownAsterisksTriangle(n);

		n = 123456;

		System.out.println("\n\nCount Number of Digits for n = " + n + "\n\n" + countNumberOfDigits(n));

		n = 20;

		System.out.println("\nFibonacci While for n = " + n + "\n");

		fibonacciWhile(n);

		System.out.println("\n\nOver Array\n");

		String[] array = { "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday" };

		overArray(array);

		System.out.println("\nOver Array Key and Value\n");

		Map<String, String> map = new LinkedHashMap<String, String>();
		map.put("mon", "Monday");
		map.put("tue", "Tuesday");
		map.put("wed", "Wednesday");
		map.put("thu", "Thursday");
		map.put("fri", "Friday");
		map.put("sat", "Saturday");
		map.put("sun", "Sunday");

		overArray(map);

		System.out.println("");

	}
}
