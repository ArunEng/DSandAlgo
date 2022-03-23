package medium.array;

import java.util.ArrayList;
import java.util.List;

public class LeftRotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> a = new ArrayList<Integer>();
		int arr[] = {1,2,3,4,5};
		
		for(int i=0; i<arr.length; i++) {
			a.add(arr[i]);
		}
		
		int d = 4;
		System.out.println(rotLeft(a, d));
	}

	public static List<Integer> rotLeft(List<Integer> a, int d) {
		// Write your code here
		for(int i=0; i<d; i++) {
			int temp = a.get(0);
			a.add(temp);
			a.remove(0);
		}
		return a;
	}

}
