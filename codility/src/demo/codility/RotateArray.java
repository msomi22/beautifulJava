/**
 * * # Original Array
	 *number: 10 20 30 40 50 60
	 *index_: 0  1  2  3  4  5
	 *
	 *# First iteration 
	 *number: 60 10 20 30 40 50
	 *index_: 0  1  2  3  4  5 
	 *
	 *# Second iteration
	 *number: 50 60 10 20 30 40
	 *index_: 0  1  2  3  4  5 
	 *
	 *# Third iteration
	 *number: 40 50 60 10 20 30
	 *index_: 0  1  2  3  4  5 
	 *
 */
package demo.codility;

/**
 * @author <a href="mwendapeter72@gmail.com"> Peter Njeru <a/>
 *
 */
public class RotateArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int[] arr = {10,20,30,40,50,60};
		int count = 3;
		rotate(arr, count);
		printArr(arr);
	}

	/**
	 * @param arr
	 * @param num
	 * @return
	 */
	private static int[] rotate(int[] arr, int num) {
		if(num == 0) {
			return arr;
		}
		int len = arr.length;
		int last = arr[len-1];
		int first = arr[0];
		arr[0] = last;
		
		for(int i=1;i<len;i++) {
			int temp = arr[i];
			arr[i] = first;
			first = temp;
		}
		return rotate(arr, num - 1); 
	}

	private static void printArr(int[] arr) {
		for(int i : arr) {
			System.out.println("arr: " + i);
		}
	}
}
