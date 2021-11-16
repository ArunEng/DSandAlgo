package easy.array;

/**
 * Example 1: Input: arr = [2,1] Output: false
 * 
 * Example 2: Input: arr = [3,5,5] Output: false
 * 
 * Example 3: Input: arr = [0,3,2,1] Output: true
 * 
 * Constraints:
 * 
 * 1 <= arr.length <= 10^4 0 <= arr[i] <= 10^4
 */

public class ValidMountainArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 2, 3, 1 };
		System.out.println(validMountainArray(arr));
	}

	static boolean validMountainArray(int[] arr) {
		if (arr.length < 3) {
			return false;
		}
		int i = 0;
		while (i < arr.length && i + 1 < arr.length && arr[i] < arr[i + 1]) {
			i++;
		}
		if (i == 0 || i == arr.length - 1) {
			return false;
		}
		while (i < arr.length && i + 1 < arr.length) {
			if (arr[i] <= arr[i + 1]) {
				return false;
			}
			i++;
		}
		return true;
	}

}
