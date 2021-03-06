package easy.array;

import java.util.Arrays;

/**
 * Given an integer array nums, return true if any value appears at least twice
 * in the array, and return false if every element is distinct.
 * 
 * Example 1:
 * Input: nums = [1,2,3,1] Output: true
 * 
 * Example 2:
 * Input: nums = [1,2,3,4] Output: false
 * 
 * Example 3:
 * Input: nums = [1,1,1,3,3,4,3,2,4,2] Output: true
 * 
 * Constraints:
 * 1 <= nums.length <= 10^5
 * -10^9 <= nums[i] <= 10^9
 */

public class ContainsDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[] = { 1, 1, 1, 3, 3, 4, 3, 2, 4, 2 };
		System.out.println(containsDuplicate(nums));
	}

	static boolean containsDuplicate(int[] nums) {
		Arrays.sort(nums);
		for (int i = 0; i < nums.length - 1; i++) {
			if (nums[i] == nums[i + 1]) {
				return true;
			}
		}
		return false;
	}

}
