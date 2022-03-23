package easy.array;

import java.util.Arrays;
import java.util.List;

public class TwoDArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<List<Integer>> arr = Arrays.asList(
				Arrays.asList(0, -4, -6, 0, -7, -6),
				Arrays.asList(-1, -2, -6, -8, -3, -1),
				Arrays.asList(-8, -4, -2, -8, -8, -6),
				Arrays.asList(-3, -1, -2, -5, -7, -4),
				Arrays.asList(-3, -5, -3, -6, -6, -6),
				Arrays.asList(-3, -6, 0, -8, -6, -7)
				);
		System.out.println(hourglassSum(arr));
	}

	public static int hourglassSum(List<List<Integer>> arr) {
		// Write your code here
		int max = Integer.MIN_VALUE;
		for(int i=0; i<4; i++) {
			for(int j=0; j<4; j++) {
				int top = arr.get(i).get(j) + arr.get(i).get(j+1) + arr.get(i).get(j+2);
				int bottom = arr.get(i+2).get(j) + arr.get(i+2).get(j+1) + arr.get(i+2).get(j+2);
				int middle = arr.get(i+1).get(j+1);
				int hourGlass = top+bottom+middle;
				if(hourGlass > max) {
					max = hourGlass;
				}
			}
		}
		return max;
	}

}
