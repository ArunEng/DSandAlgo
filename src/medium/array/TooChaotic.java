package medium.array;

import java.util.Arrays;
import java.util.List;

public class TooChaotic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> q = Arrays.asList(2,1,5,3,4);
		minimumBribes(q);
	}

	public static void minimumBribes(List<Integer> q) {
		// Write your code here
		int n = q.size();
		int swaps = 0;
		for(int i=n-1; n>=0; i--) {
			if(q.get(i) != i+1) {
				if(((i-1) >=0) && q.get(i-1) == i+1) {
					swaps++;
					int temp = q.get(i-1);
					q.set(i-1, q.get(i));
					q.set(i, temp);
				}else if(((i-2) >= 0) && q.get(i-2) == i+1) {
					swaps+=2;
					q.set(i-2, q.get(i-1));
					q.set(i-1, q.get(i));
					q.set(i, i+1);
				}else {
					System.out.println("Too Chaotic");
					return;
				}
				System.out.println(i);
			}
		}
		System.out.println(swaps);
	}

}
