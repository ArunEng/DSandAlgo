package easy.array;

import java.util.Arrays;

/**
 * Given an integer array nums sorted in non-decreasing order, return an array
 * of the squares of each number sorted in non-decreasing order.
 * 
 * Example 1: Input: nums = [-4,-1,0,3,10] Output: [0,1,9,16,100] Explanation:
 * After squaring, the array becomes [16,1,0,9,100]. After sorting, it becomes
 * [0,1,9,16,100].
 * 
 * Example 2: Input: nums = [-7,-3,2,3,11] Output: [4,9,9,49,121]
 * 
 * Constraints: 1 <= nums.length <= 104 -104 <= nums[i] <= 104 nums is sorted in
 * non-decreasing order.
 *
 */

public class SquaresofaSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[] = { -7, -3, 2, 3, 11 };
		System.out.println(Arrays.toString(squareAndSort(nums)));
	}

	static int[] squareAndSort(int nums[]) {
		int res[] = new int[nums.length];
		int arrLength = nums.length - 1;
		for (int i = 0, j = nums.length - 1; i < nums.length; arrLength--) {
			if (i > j) {
				break;
			}
			int left = Math.abs(nums[i]);
			int right = Math.abs(nums[j]);
			if (left > right) {
				res[arrLength] = nums[i] * nums[i];
				i++;
			} else {
				res[arrLength] = nums[j] * nums[j];
				j--;
			}
		}
		return res;
	}

}
