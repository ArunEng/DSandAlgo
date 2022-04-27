/**
Given an array of integers nums sorted in non-decreasing order, find the starting and ending position of a given target value.
If target is not found in the array, return [-1, -1].
You must write an algorithm with O(log n) runtime complexity.

Example 1:
Input: nums = [5,7,7,8,8,10], target = 8
Output: [3,4]

Example 2:
Input: nums = [5,7,7,8,8,10], target = 6
Output: [-1,-1]

Example 3:
Input: nums = [], target = 0
Output: [-1,-1]

Constraints:
    0 <= nums.length <= 10^5
    -10^9 <= nums[i] <= 10^9
    nums is a non-decreasing array.
    -10^9 <= target <= 10^9
*/

package medium.binarysearch;

public class FindFirstandLastPositionofElementinSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[] = { 5, 7, 7, 8, 8, 10 }, target = 6;
		System.out.println(searchRange(nums, target));
	}

	static int[] searchRange(int[] nums, int target) {
		int res [] = {-1, -1};
        if(nums.length == 0) return res;
        int left = 0, right = nums.length-1;
        int r = -1;
        while(left <= right){
            int mid = left + (right-left)/2;
            if(nums[mid] == target){
                r = mid;
                left = mid+1;
            }
            else if(nums[mid] > target){
                right = mid-1;
            }else{
                left= mid+1;
            }
        }
        res[1] = r;
        left = 0; right = nums.length-1; r=-1;
        while(left<=right){
            int mid = left + (right-left)/2;
            if(nums[mid] == target){
                r = mid;
                right = mid-1;
            }else if(nums[mid] > target){
                right = mid-1;
            }else{
                left = mid+1;
            }
        }
        res[0] = r;
        return res;
	}

}
