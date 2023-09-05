/**
 * Write a function to find the longest common prefix string amongst an array of strings.
 * If there is no common prefix, return an empty string "".
 * <p>
 * Example 1:
 * Input: strs = ["flower","flow","flight"]
 * Output: "fl"
 * <p>
 * Example 2:
 * Input: strs = ["dog","racecar","car"]
 * Output: ""
 * Explanation: There is no common prefix among the input strings.
 * <p>
 * Constraints:
 * 1 <= strs.length <= 200
 * 0 <= strs[i].length <= 200
 * strs[i] consists of only lower-case English letters.
 */

package easy.array;

public class LongestCommonPrefix {

    public static void main(String[] args) {
        String[] str = {"flower", "flow", "flight"};
        System.out.println(longestCommonPrefix(str));
    }

    static String longestCommonPrefix(String[] str) {
        String res = str[0];
        for (int i = 1; i < str.length; i++) {
            String compare = str[i], temp = "";
            for (int j = 0; j < res.length() && j < compare.length(); j++) {
                if (res.charAt(j) == compare.charAt(j)) {
                    temp += res.charAt(j);
                } else break;
            }
            res = temp;
        }
        return res;
    }

}
