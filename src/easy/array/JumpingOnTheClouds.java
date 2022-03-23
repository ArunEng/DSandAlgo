package easy.array;

import java.util.Arrays;
import java.util.List;

public class JumpingOnTheClouds {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> c = Arrays.asList(0, 0, 1, 0, 0, 1, 0);
		System.out.println(jumpingOnClouds(c));
	}

	public static int jumpingOnClouds(List<Integer> c) {
		// Write your code here
		int jumps = 0;
		for(int i=0; i<c.size(); i++) {
			if(i+2 <= c.size()-1 && c.get(i+2) == 0) {
				jumps++;
				i += 1;
			}
			else if(i+1 <= c.size()-1 && c.get(i+1) == 0) {
				jumps++;
			}
		}
		return jumps;

	}
}
