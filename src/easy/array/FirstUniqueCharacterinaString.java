package easy.array;


/**
 * Given a string s, find the first non-repeating character in it and return its
 * index. If it does not exist, return -1.
 * 
 * Example 1:
 * Input: s = "leetcode" Output: 0
 * 
 * Example 2:
 * Input: s = "loveleetcode" Output: 2
 * 
 * Example 3:
 * Input: s = "aabb" Output: -1
 * 
 * Constraints:
 * 1 <= s.length <= 10^5 
 * s consists of only lowercase English letters.
 */

public class FirstUniqueCharacterinaString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "aabb";
		System.out.println(firstUniqChar(s));
	}
	
	static int firstUniqChar(String s) {
		int freq[] = new int[26];
		int length = s.length();
		for(int i=0; i<length; i++) {
			freq[s.charAt(i) - 'a']++;
		}
		for(int i=0; i<length; i++) {
			if(freq[s.charAt(i) - 'a'] == 1) {
				return i;
			}
		}
		return -1;
	}

}
