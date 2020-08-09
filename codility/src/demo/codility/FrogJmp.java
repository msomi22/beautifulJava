/**
 * A small frog wants to get to the other side of the road. The frog is currently located at position X and wants
 *  to get to a position greater than or equal to Y. The small frog always jumps a fixed distance, D.
 *  Count the minimal number of jumps that the small frog must perform to reach its target.
 *  
 *  Write a function:
 *  
 *  class Solution { public int solution(int X, int Y, int D); }
 *  
 *  that, given three integers X, Y and D, returns the minimal number of jumps from position X to a position equal to or greater than Y.
 *  
 *  For example, given:
 *  
 *  X = 10
 *  Y = 85
 *  D = 30
 *  
 *  the function should return 3, because the frog will be positioned as follows:
 *  
 *  after the first jump, at position 10 + 30 = 40
 *  after the second jump, at position 10 + 30 + 30 = 70
 *  after the third jump, at position 10 + 30 + 30 + 30 = 100
 *  Write an efficient algorithm for the following assumptions:
 *  
 *  X, Y and D are integers within the range [1..1,000,000,000];
 *  X ≤ Y.
 *  
 */
package demo.codility;

/**
 * @author pmnjeru
 *
 */
public class FrogJmp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int X = 70, Y = 110, D = 40;
		int output = solution(X, Y, D);
		System.out.println("output = " + output);
		//System.out.println((100-10) % 30);//5
		//System.out.println((100-10) / 30);//8
		
	}
	
	public static int solution(int X, int Y, int D) {
		int temp = X;
		System.out.println("X = " + X + " X/D = " + (X/D) + " X%D = " + (X%D) + " temp=" + temp);
		/*if(X > Y)
			return 0;
		if(X == Y)
			return 1;*/
		if(X >= Y) {
			return (X/D);
		}
		return solution(X+D, Y, D);
	}

}
