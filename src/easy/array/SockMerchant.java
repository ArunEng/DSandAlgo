package easy.array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SockMerchant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=7;
		List<Integer> ar = Arrays.asList(1,2,1,2,1,3,2,3);
		System.out.println(sockMerchant(n, ar));
	}

	public static int sockMerchant(int n, List<Integer> ar) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		int count = 0;
		for(int i=0; i<n; i++) {
			if(!map.containsKey(ar.get(i))) {
				map.put(ar.get(i), 1);
			}else {
				count++;
				map.remove(ar.get(i));
			}
		}
		return count;
	}

}
