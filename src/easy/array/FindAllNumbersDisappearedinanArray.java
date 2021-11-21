package easy.array;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Given an array nums of n integers where nums[i] is in the range [1, n],
 * return an array of all the integers in the range [1, n] that do not appear in
 * nums.
 * 
 * Example 1:
 * Input: nums = [4,3,2,7,8,2,3,1] Output: [5,6]
 * 
 * Example 2:
 * Input: nums = [1,1] Output: [2]
 * 
 * Constraints:
 * n == nums.length
 * 1 <= n <= 10^5
 * 1 <= nums[i] <= n
 */

public class FindAllNumbersDisappearedinanArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[] = { 4, 3, 2, 7, 8, 2, 3, 1 };
		System.out.println(findDisappearedNumbers(nums));
	}

	static List<Integer> findDisappearedNumbers(int[] nums) {
		List<Integer> res = new ArrayList<Integer>();
		Set<Integer> arr = new HashSet<Integer>();
		for (int i : nums) {
			arr.add(i);
		}
		for (int i = 1; i <= nums.length; i++) {
			if (!arr.contains(i)) {
				res.add(i);
			}
		}
		return res;
	}

}
