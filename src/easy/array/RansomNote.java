package easy.array;

/**
 * Given two stings ransomNote and magazine, return true if ransomNote can be
 * constructed from magazine and false otherwise.
 * 
 * Each letter in magazine can only be used once in ransomNote.
 * 
 * Example 1:
 * Input: ransomNote = "a", magazine = "b" Output: false
 * 
 * Example 2:
 * Input: ransomNote = "aa", magazine = "ab" Output: false
 * 
 * Example 3:
 * Input: ransomNote = "aa", magazine = "aab" Output: true
 * 
 * Constraints:
 * 1 <= ransomNote.length, magazine.length <= 10^5
 * ransomNote and magazine consist of lowercase English letters.
 */

public class RansomNote {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ransomNote = "aab";
		String magazine = "baa";
		System.out.println(canConstruct(ransomNote, magazine));
	}

	static boolean canConstruct(String ransomNote, String magazine) {
		for(int i=0;i<magazine.length(); i++) {
			for(int j=i+1; j<magazine.length(); j++) {
				if(magazine.subSequence(i, j).equals(ransomNote)) {
					return true;
				}
			}
		}
		return false;
	}

}
