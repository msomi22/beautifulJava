/**
 * A binary gap within a positive integer N is any maximal sequence of consecutive zeros 
 * that is surrounded by ones at both ends in the binary representation of N.
 * 
 * For example, number 9 has binary representation 1001 and contains a binary gap of length 2. 
 * The number 529 has binary representation 1000010001 and contains two binary gaps: 
 * one of length 4 and one of length 3.
 * 
 * The number 20 has binary representation 10100 and contains one binary gap of length 1. 
 * The number 15 has binary representation 1111 and has no binary gaps. 
 * The number 32 has binary representation 100000 and has no binary gaps.
 * 
 * Write a function: class Solution { public int solution(int N); }
 * 
 * that, 
 * 
 * Given a positive integer N, returns the length of its longest binary gap. 
 * The function should return 0 if N doesn't contain a binary gap.
 * 
 * For example, given N = 1041 the function should return 5, 
 * because N has binary representation 10000010001 and so its longest binary gap is of length 5. 
 * 
 * Given N = 32 the function should return 0, because N has binary representation '100000' and thus no binary gaps.
 * 
 * Write an efficient algorithm for the following assumptions:
 * N is an integer within the range [1..2,147,483,647]. 
 * 
 */
package demo.codility;

/**
 * @author pmnjeru
 *
 */
public class BinaryGap {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int num = 529;
		int ouput = solution(num);
		System.out.println("max = " + ouput);
	}
	
	public static int solution(int n) {
		int result = 0;
		int temp = 0;
		String intbinary = Integer.toBinaryString(n);
		for(int i = 0; i < intbinary.length(); i++) {
			if(intbinary.charAt(i) == '0') {
				result++;
				continue;
			}
			temp = (result > temp) ? result : temp;
			result = 0;
			
		}
		return temp;
	}

	/**
	 * 
	 * @param num
	 * @return
	 */
	private static int solutionBad(int num) {
		int max = 0;
		if (num <= Integer.MAX_VALUE) {
			String bin = Integer.toBinaryString(num);
			String gaps = "";
			boolean gotOne = false, isZero = false;
			int zerosAfterOne = 0;
			for (int i = 0; i < bin.length(); i++) {
				if (bin.charAt(i) == '1') {
					gotOne = true;
					isZero = false;
				} else {
					isZero = true;
				}
				if (gotOne && bin.charAt(i) == '0') {
					zerosAfterOne++;
					isZero = true;
				}

				if (gotOne && !isZero) {
					gaps += "^" + zerosAfterOne;
					zerosAfterOne = 0;
				}
			}
			String[] gap = gaps.split("\\^");
			int prev = 0, maxTemp = 0;
			for (int i = 0; i < gap.length; i++) {
				int temp = gap[i].isEmpty() ? 0 : Integer.valueOf(gap[i]);
				maxTemp = temp > prev ? temp : prev;
				prev = maxTemp;
				max = maxTemp > temp ? maxTemp : temp;
			}
		} else {
			return 0;
		}
		return max;
	}

}
