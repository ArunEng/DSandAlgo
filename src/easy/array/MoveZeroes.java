package easy.array;

import java.util.Arrays;

/**
 * Given an integer array nums, move all 0's to the end of it while maintaining
 * the relative order of the non-zero elements.
 * 
 * Note that you must do this in-place without making a copy of the array.
 * 
 * Example 1:
 * Input: nums = [0,1,0,3,12] Output: [1,3,12,0,0]
 * 
 * Example 2:
 * Input: nums = [0] Output: [0]
 * 
 * Constraints:
 * 1 <= nums.length <= 10^4 
 * -2^31 <= nums[i] <= 2^31 - 1
 */

public class MoveZeroes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[] = { 0, 1, 0, 3, 12 };
		moveZeroes(nums);
		System.out.println(Arrays.toString(nums));
	}

	static void moveZeroes(int[] nums) {
		for (int i = 0, j = 0; i < nums.length; i++) {
			if (nums[i] != 0) {
				int temp = nums[j];
				nums[j] = nums[i];
				nums[i] = temp;
				j++;
			}
		}
	}

}
