package medium.array;

/*
* Given an input string s, reverse the order of the words.

A word is defined as a sequence of non-space characters. The words in s will be separated by at least one space.

Return a string of the words in reverse order concatenated by a single space.

Note that s may contain leading or trailing spaces or multiple spaces between two words. The returned string should only have a single space separating the words. Do not include any extra spaces.

Example 1:
Input: s = "the sky is blue"
Output: "blue is sky the"
*
Example 2:
Input: s = "  hello world  "
Output: "world hello"
Explanation: Your reversed string should not contain leading or trailing spaces.
*
Example 3:
Input: s = "a good   example"
Output: "example good a"
Explanation: You need to reduce multiple spaces between two words to a single space in the reversed string.

Constraints:
1 <= s.length <= 104
s contains English letters (upper-case and lower-case), digits, and spaces ' '.
There is at least one word in s.

Follow-up: If the string data type is mutable in your language, can you solve it in-place with O(1) extra space?
* */

import java.util.ArrayList;

public class ReverseWordsInAString {
    public static void main(String[] args) {
        String s = "  hello world  ";
        System.out.println(reverseWords(s));
    }

    public static String reverseWords(String s) {
        StringBuilder res = new StringBuilder();
        ArrayList<String> arr = new ArrayList<>();
        StringBuilder temp = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != ' ') {
                temp.append(s.charAt(i));
            } else {
                if (!temp.isEmpty()) {
                    arr.add(temp.toString());
                    temp = new StringBuilder();
                }
            }
        }
        if (!temp.isEmpty()) {
            arr.add(temp.toString());
        }
        for (int i = arr.size() - 1; i > 0; i--) {
            res.append(arr.get(i)).append(" ");
        }
        res.append(arr.get(0));
        return res.toString();
    }
}
