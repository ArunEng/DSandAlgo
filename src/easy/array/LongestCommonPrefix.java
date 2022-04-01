/**
Write a function to find the longest common prefix string amongst an array of strings.
If there is no common prefix, return an empty string "".

Example 1:
Input: strs = ["flower","flow","flight"]
Output: "fl"

Example 2:
Input: strs = ["dog","racecar","car"]
Output: ""
Explanation: There is no common prefix among the input strings.

Constraints:
    1 <= strs.length <= 200
    0 <= strs[i].length <= 200
    strs[i] consists of only lower-case English letters.
*/

package easy.array;

public class LongestCommonPrefix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String strs[] = { "flower", "flow", "flight" };
		System.out.println(longestCommonPrefix(strs));
	}

	static String longestCommonPrefix(String[] strs) {
		String res = strs[0];
		for(int i = 1; i<strs.length; i++) {
			String compare = strs[i], temp = "";
			for(int j=0;j<res.length() && j<compare.length(); j++) {
				if(res.charAt(j) == compare.charAt(j)) {
					temp+=res.charAt(j);
				}else break;
			}
			res = temp;
		}
		return res;
	}

}
