package br.com.mesquitagomes.codility.lessons.timecomplexity;

/**
 * A small frog wants to get to the other side of the road. The frog is currently located at position X and wants to get to a position
 * greater than or equal to Y. The small frog always jumps a fixed distance, D.
 * 
 * Count the minimal number of jumps that the small frog must perform to reach its target.
 * 
 * Write a function:
 * 
 * class Solution { public int solution(int X, int Y, int D); } that, given three integers X, Y and D, returns the minimal number of jumps
 * from position X to a position equal to or greater than Y.
 * 
 * For example, given:
 * 
 * <pre>
 *   X = 10
 *   Y = 85
 *   D = 30
 * </pre>
 * 
 * the function should return 3, because the frog will be positioned as follows:
 * 
 * <pre>
 * after the first jump, at position 10 + 30 = 40
 * after the second jump, at position 10 + 30 + 30 = 70
 * after the third jump, at position 10 + 30 + 30 + 30 = 100
 * </pre>
 * 
 * Assume that:
 * 
 * X, Y and D are integers within the range [1..1,000,000,000];
 * 
 * X <= Y.
 * 
 * Complexity:
 * 
 * <pre>
 * * expected worst-case time complexity is O(1);
 * * expected worst-case space complexity is O(1).
 * </pre>
 * 
 * @author mesquitagomes
 *
 */
public class FrogJmp {

	public int solution(int X, int Y, int D) {

		int result = ((Y - X) / D);
		if ((Y - X) % D > 0) result += 1;

		return result;
	}

	public static void main(String[] args) {

		FrogJmp fj = new FrogJmp();

		System.out.println(fj.solution(10, 85, 30));
		System.out.println(fj.solution(10, 20, 5));

	}
}
