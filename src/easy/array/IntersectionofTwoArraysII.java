package easy.array;

import java.util.Arrays;
/**
 * Given two integer arrays nums1 and nums2, return an array of their
 * intersection. Each element in the result must appear as many times as it
 * shows in both arrays and you may return the result in any order.
 * 
 * Example 1:
 * Input: nums1 = [1,2,2,1], nums2 = [2,2] Output: [2,2]
 * 
 * Example 2:
 * Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4] Output: [4,9] Explanation: [9,4]
 * is also accepted.
 * 
 * Constraints:
 * 1 <= nums1.length, nums2.length <= 1000
 * 0 <= nums1[i], nums2[i] <= 1000
 */

public class IntersectionofTwoArraysII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums1[] = { 4, 9, 5 }, nums2[] = { 9, 4, 9, 8, 4 };
		System.out.println(Arrays.toString(intersect(nums1, nums2)));
	}

	static int[] intersect(int[] nums1, int[] nums2) {
		Arrays.sort(nums1);
		Arrays.sort(nums2);
		int i = 0, j = 0, k=0;
		while (i < nums1.length && j < nums2.length) {
			if (nums1[i] < nums2[j]) {
				i++;
			} else if (nums1[i] > nums2[j]) {
				j++;
			} else {
				nums1[k++] = nums1[i];
				i++;
				j++;
			}
		}
		int res[] = new int[k];
		for (i = 0; i < k; i++) {
			res[i] = nums1[i];
		}
		return res;
	}

}
