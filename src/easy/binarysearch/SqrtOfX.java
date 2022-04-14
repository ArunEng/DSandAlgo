/**
Given a non-negative integer x, compute and return the square root of x.
Since the return type is an integer, the decimal digits are truncated, and only the integer part of the result is returned.

Note: You are not allowed to use any built-in exponent function or operator, such as pow(x, 0.5) or x ** 0.5.

Example 1:
Input: x = 4
Output: 2

Example 2:
Input: x = 8
Output: 2
Explanation: The square root of 8 is 2.82842..., and since the decimal part is truncated, 2 is returned.

Constraints:
    0 <= x <= 2^31 - 1
 */

package easy.binarysearch;

public class SqrtOfX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 9;
		System.out.println(mySqrt(x));
	}

	static int mySqrt(int x) {
		if (x == 0 || x == 1)
			return x;

		long low = 1, high = x, ans = 0;
		while (low <= high) {
			long middle = (low + high) / 2;
			if (middle * middle == x)
				return (int) middle;
			else if (middle * middle < x) {
				low = middle + 1;
				ans = middle;
			} else {
				high = middle - 1;
			}
		}
		return (int) ans;
	}
}
