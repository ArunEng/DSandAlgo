package easy.array;

public class CountingValleys {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int steps = 8;
		String path = "UDDDUDUU";
		System.out.println(countingValleys(steps, path));
	}

	public static int countingValleys(int steps, String path) {
		// Write your code here
		int valley = 0;
		int step = 0;
		char[] arr = path.toCharArray();
		for(int i=0; i<steps; i++) {
			if(arr[i] == 'U') {
				step++;
			}else {
				step--;
			}
			if(step == 0 && arr[i] == 'U') {
				valley++;
			}
		}
		return valley;
	}

}
