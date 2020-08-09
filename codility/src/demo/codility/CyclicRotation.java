/**
 * 
 */
package demo.codility;

/**
 * @author pmnjeru
 *
 */
public class CyclicRotation {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] A = {};
		int K = 3;
		solution(A, K);
		
	}
	
	
	/**
	 * @param arr
	 * @param num
	 * @return
	 */
	private static int[] solution(int[] A, int K) {
		if(K == 0 || A.length == 0) {
			return A;
		}
		int len = A.length;
		int last = A[len-1];
		int first = A[0];
		A[0] = last;
		
		for(int i=1;i<len;i++) {
			int temp = A[i];
			A[i] = first;
			first = temp;
		}
		return solution(A, K - 1); 
	}

}
