package easy.array;

/**
 * Given an integer array nums, find the contiguous subarray (containing at
 * least one number) which has the largest sum and return its sum.
 * 
 * A subarray is a contiguous part of an array.
 * 
 * Example 1:
 * Input: nums = [-2,1,-3,4,-1,2,1,-5,4] Output: 6 Explanation: [4,-1,2,1] has
 * the largest sum = 6.
 * 
 * Example 2:
 * Input: nums = [1] Output: 1
 * 
 * Example 3:
 * Input: nums = [5,4,-1,7,8] Output: 23
 * 
 * Constraints:
 * 
 * 1 <= nums.length <= 10^5
 * -10^4 <= nums[i] <= 10^4
 */

public class MaximumSubarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[] = {-1};
		System.out.println(maxSubArray(nums));
	}

	static int maxSubArray(int[] nums) {
		int max = nums[0], current = max;
		for(int i=1;i<nums.length;i++) {
			current = Math.max(nums[i], nums[i]+current);
			max = Math.max(max, current);
		}
		return max;
	}

}
