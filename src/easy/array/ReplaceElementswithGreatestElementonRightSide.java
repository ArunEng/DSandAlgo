package easy.array;

import java.util.Arrays;

/**
 * Given an array arr, replace every element in that array with the greatest
 * element among the elements to its right, and replace the last element with
 * -1.
 * 
 * After doing so, return the array.
 * 
 * Example 1:
 * Input: arr = [17,18,5,4,6,1] Output: [18,6,6,6,1,-1] Explanation: - index 0
 * --> the greatest element to the right of index 0 is index 1 (18). - index 1
 * --> the greatest element to the right of index 1 is index 4 (6). - index 2
 * --> the greatest element to the right of index 2 is index 4 (6). - index 3
 * --> the greatest element to the right of index 3 is index 4 (6). - index 4
 * --> the greatest element to the right of index 4 is index 5 (1). - index 5
 * --> there are no elements to the right of index 5, so we put -1.
 * 
 * Example 2:
 * Input: arr = [400] Output: [-1] Explanation: There are no elements to the
 * right of index 0.
 * 
 * Constraints:
 * 1 <= arr.length <= 10^4
 * 1 <= arr[i] <= 10^5
 */

public class ReplaceElementswithGreatestElementonRightSide {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {17,18,5,4,6,1};
		System.out.println(Arrays.toString(replaceElements(arr)));
	}

	static int[] replaceElements(int[] arr) {
		for(int i=0; i<arr.length-1; i++) {
			int maxIndex = getMaxIndex(arr, i+1);
			for(int j=i; j<maxIndex; j++) {
				arr[j] = arr[maxIndex];
				i = maxIndex -1;
			}
		}
		arr[arr.length-1] = -1;
		return arr;
	}
	
	static int getMaxIndex(int[] arr, int i) {
		int max = 0;
		int maxIndex = 0;
		while(i<arr.length) {
			if(max<arr[i]) {
				max = arr[i];
				maxIndex = i;
			}
			i++;
		}
		return maxIndex;
	}

}
